package br.com.grupojcr.rmws.ws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;

import br.com.grupojcr.rmws.business.RMBusiness;
import br.com.grupojcr.rmws.dao.RMDAO;
import br.com.grupojcr.rmws.dto.ColigadaDTO;
import br.com.grupojcr.rmws.dto.JsonSerialize;
import br.com.grupojcr.rmws.dto.MonitorAprovacaoDTO;
import br.com.grupojcr.rmws.dto.MovimentoDTO;
import br.com.grupojcr.rmws.util.EnviaEmail;
import br.com.grupojcr.rmws.util.TreatString;
import br.com.grupojcr.rmws.util.Util;

@Path("/aprovacao")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AprovacaoWSRest {
	
	protected static Logger LOG = Logger.getLogger(AprovacaoWSRest.class);
	
	private static final String PRE_APROVADO = "Pré-Aprovado";
	private static final String APROVADO = "Aprovado";
	private static final String REPROVADO = "Reprovado";
	
	@EJB
	private RMDAO rmDAO;
	@EJB
	private RMBusiness rmBusiness;

	/**
	 * Método do WS responsável por obter os dados do movimento
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param data : String
	 * @return Response
	 */
	@POST
	@Path("/dados")
	public Response obterDadosMovimento(String data) {
		LOG.info("[obterDadosMovimento] Método iniciado");
		try {
			JsonSerialize movimento = (JsonSerialize) new Gson().fromJson(data, JsonSerialize.class);
			if (TreatString.isNotBlank(data).booleanValue()) {
				LOG.info("[obterDadosMovimento] Obtendo movimento...");
				MovimentoDTO dto = rmDAO.obterMovimento(movimento.getIdMovimento(), movimento.getIdColigada());
				return Response.status(200).entity(dto).build();
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return Response.status(500).entity(e).build();
		}
		return Response.status(400).build();
	}

	/**
	 * Método do WS responsável por aprovar o movimento
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param data : String
	 * @return Response
	 */
	@POST
	@Path("/aprovarMovimento")
	public Response aprovarMovimento(String data) {
		LOG.info("[aprovarMovimento] Método iniciado");
		try {
			JsonSerialize movJson = (JsonSerialize) new Gson().fromJson(data, JsonSerialize.class);
			LOG.info("[aprovarMovimento] Obtendo movimento...");
			MovimentoDTO movimento = rmDAO.obterMovimento(movJson.getIdMovimento(), movJson.getIdColigada());
			if (Util.isNotNull(movimento)) {
				LOG.info("[aprovarMovimento] Verificando se é primeira ou segunda aprovação e se foi aprovada ou reprovada.");
				if (movJson.getAprovador().equals(Integer.valueOf(1))) {
					if (movJson.getStatusAprovacao().equals(Integer.valueOf(1))) {
						
						rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
								movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), PRE_APROVADO,
								movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
								movimento.getUsrSolicitante(), Calendar.getInstance().getTime(),
								movJson.getUsuarioAprovou(), Calendar.getInstance().getTime());
						LOG.info("[aprovarMovimento] 1ª Aprovação: Pré-Aprovado por " + movJson.getUsuarioAprovou());
					} else {
						rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
								movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), REPROVADO,
								movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
								movimento.getUsrSolicitante(), Calendar.getInstance().getTime(),
								movJson.getUsuarioAprovou(), Calendar.getInstance().getTime());
						LOG.info("[aprovarMovimento] 1ª Aprovação: Reprovado por " + movJson.getUsuarioAprovou());
					}
				} else if (movJson.getStatusAprovacao().equals(Integer.valueOf(1))) {
					rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
							movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), APROVADO,
							movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
							movimento.getUsrSolicitante(), Calendar.getInstance().getTime(), movJson.getUsuarioAprovou(),
							Calendar.getInstance().getTime());
					LOG.info("[aprovarMovimento] 2ª Aprovação: Aprovado por " + movJson.getUsuarioAprovou());
					
					LOG.info("[IaprovarMovimentoNFO] 2ª Aprovação: Aprovando no RM...");
					rmDAO.incluirAprovacaoRM(movimento.getIdColigada(), movimento.getIdMov(), movJson.getUsuarioAprovou());
					
					LOG.info("[aprovarMovimento] Iniciando envio de e-mail...");
					EnviaEmail env = new EnviaEmail();
					try {
						MonitorAprovacaoDTO primeiraAprovacao = rmDAO
								.obterPrimeiroAprovadorMonitor(movimento.getIdColigada(), movimento.getIdMov());
						primeiraAprovacao.setObservacao(movJson.getObservacaoPrimeiroAprovador());
						primeiraAprovacao.setNomeUsuario(rmDAO.obterNomeAprovador(primeiraAprovacao.getUsuarioAprovou()));
						MonitorAprovacaoDTO segundaAprovacao = rmDAO.obterSegundoAprovadorMonitor(movimento.getIdColigada(),
								movimento.getIdMov());
						segundaAprovacao.setObservacao(movJson.getObservacaoSegundoAprovador());
						segundaAprovacao.setNomeUsuario(rmDAO.obterNomeAprovador(segundaAprovacao.getUsuarioAprovou()));
						env.enviaEmailOrdemCompra("APROVAÇÃO DE ORDEM DE COMPRA",
								new String[] { "mattosl@grupojcr.com.br" }, movimento, primeiraAprovacao, segundaAprovacao);
						LOG.info("[aprovarMovimento] Email enviado com sucesso!");
					} catch (Exception e) {
						LOG.error("[aprovarMovimento] E-mail não enviado: " + e.getMessage());
					}
				} else {
					rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
							movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), REPROVADO,
							movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
							movimento.getUsrSolicitante(), Calendar.getInstance().getTime(), movJson.getUsuarioAprovou(),
							Calendar.getInstance().getTime());
					LOG.info("[aprovarMovimento] 2ª Aprovação: Reprovado por " + movJson.getUsuarioAprovou());
				}
	
				LOG.info("[aprovarMovimento] Movimento aprovado com sucesso!");
				return Response.status(200).build();
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return Response.status(500).entity(e).build();
		}
		return Response.status(400).build();
	}

	/**
	 * Método do WS responsável por gerar relatório de aprovação
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param data : String
	 * @return Response
	 */
	@POST
	@Path("/gerarRelatorioAprovacao")
	public Response gerarRelatorioAprovacao(String data) {
		LOG.info("[gerarRelatorioAprovacao] Método iniciado");
		try {
			JsonSerialize jsonRelatorio = (JsonSerialize) new Gson().fromJson(data, JsonSerialize.class);
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			Date dtInicio = formato.parse(jsonRelatorio.getPeriodoInicial());
			Date dtFinal = formato.parse(jsonRelatorio.getPeriodoFinal());
			LOG.info("[gerarRelatorioAprovacao] Listando movimentos...");
			List<MovimentoDTO> listaMovimento = rmBusiness.listarMovimentos(jsonRelatorio.getUsuarioLogado(), dtInicio, dtFinal, jsonRelatorio.getIdColigada());
			return Response.status(200).entity(listaMovimento).build();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return Response.status(500).entity(e).build();
		}
	}

	/**
	 * Método do WS responsável por listar coligadas do RM 
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param data : String
	 * @return Response
	 */
	@POST
	@Path("/coligadas")
	public Response listarColigadas(String data) throws ParseException {
		LOG.info("[listarColigadas] Método iniciado");
		try {
			LOG.info("[listarColigadas] Listando coligadas...");
			List<ColigadaDTO> listaColigada = rmDAO.listarColigadas();
			return Response.status(200).entity(listaColigada).build();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			return Response.status(500).entity(e).build();
		}
	}
}
