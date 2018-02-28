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
	
	private static final String PRE_APROVADO = "Pré-Aprovado";
	private static final String APROVADO = "Aprovado";
	private static final String REPROVADO = "Reprovado";
	
	@EJB
	private RMDAO rmDAO;
	@EJB
	private RMBusiness rmBusiness;

	@POST
	@Path("/dados")
	public Response obterDadosMovimento(String data) {
		JsonSerialize movimento = (JsonSerialize) new Gson().fromJson(data, JsonSerialize.class);
		if (TreatString.isNotBlank(data).booleanValue()) {
			MovimentoDTO dto = rmDAO.obterMovimento(movimento.getIdMovimento(), movimento.getIdColigada());
			return Response.status(200).entity(dto).build();
		}
		return Response.status(406).build();
	}

	@POST
	@Path("/aprovarMovimento")
	public Response aprovarMovimento(String data) {
		JsonSerialize movJson = (JsonSerialize) new Gson().fromJson(data, JsonSerialize.class);
		MovimentoDTO movimento = rmDAO.obterMovimento(movJson.getIdMovimento(), movJson.getIdColigada());
		if (Util.isNotNull(movimento)) {
			if (movJson.getAprovador().equals(Integer.valueOf(1))) {
				if (movJson.getStatusAprovacao().equals(Integer.valueOf(1))) {
					rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
							movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), PRE_APROVADO,
							movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
							movimento.getUsrSolicitante(), Calendar.getInstance().getTime(),
							movJson.getUsuarioAprovou(), Calendar.getInstance().getTime());
				} else {
					rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
							movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), REPROVADO,
							movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
							movimento.getUsrSolicitante(), Calendar.getInstance().getTime(),
							movJson.getUsuarioAprovou(), Calendar.getInstance().getTime());
				}
			} else if (movJson.getStatusAprovacao().equals(Integer.valueOf(1))) {
				rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
						movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), APROVADO,
						movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
						movimento.getUsrSolicitante(), Calendar.getInstance().getTime(), movJson.getUsuarioAprovou(),
						Calendar.getInstance().getTime());
				rmDAO.incluirAprovacaoRM(movimento.getIdColigada(), movimento.getIdMov(), movJson.getUsuarioAprovou());

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
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
						movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), REPROVADO,
						movJson.getUsuarioAprovou(), null, Calendar.getInstance().getTime(), null,
						movimento.getUsrSolicitante(), Calendar.getInstance().getTime(), movJson.getUsuarioAprovou(),
						Calendar.getInstance().getTime());
			}

			return Response.status(200).build();
		}
		return Response.status(406).build();
	}

	@POST
	@Path("/gerarRelatorioAprovacao")
	public Response gerarRelatorioAprovacao(String data) throws ParseException {
		JsonSerialize jsonRelatorio = (JsonSerialize) new Gson().fromJson(data, JsonSerialize.class);
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dtInicio = formato.parse(jsonRelatorio.getPeriodoInicial());
		Date dtFinal = formato.parse(jsonRelatorio.getPeriodoFinal());
		List<MovimentoDTO> listaMovimento = rmBusiness.listarMovimentos(jsonRelatorio.getUsuarioLogado(), dtInicio, dtFinal,
				jsonRelatorio.getIdColigada());
		return Response.status(200).entity(listaMovimento).build();
	}

	@POST
	@Path("/coligadas")
	public Response listarColigadas(String data) throws ParseException {
		List<ColigadaDTO> listaColigada = rmDAO.listarColigadas();
		return Response.status(200).entity(listaColigada).build();
	}
}
