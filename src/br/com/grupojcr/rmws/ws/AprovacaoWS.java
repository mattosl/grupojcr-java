package br.com.grupojcr.rmws.ws;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;

import br.com.grupojcr.rmws.business.FluigBusiness;
import br.com.grupojcr.rmws.dao.RMDAO;
import br.com.grupojcr.rmws.dto.AprovadorDTO;
import br.com.grupojcr.rmws.dto.MovimentoDTO;
import br.com.grupojcr.rmws.util.Util;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class AprovacaoWS {
	protected static Logger LOG = Logger.getLogger(AprovacaoWS.class);
	
	private static final String AGUARDANDO_APROVACAO = "Aguardando Aprovação";
	
	@EJB
	private RMDAO rmDAO;
	@EJB
	private FluigBusiness fluigBusiness;

	/**
	 * Método do WS SOAP responsável por iniciar o workflow de aprovação
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param data : String
	 * @return String
	 */
	@WebMethod
	public String iniciarAprovacao(@WebParam(name = "movimento") Integer idMovimento, @WebParam(name = "coligada") Integer idColigada) {
		LOG.info("[iniciarAprovacao] Método iniciado.");
		try {
			LOG.info("[iniciarAprovacao] Obtendo ultima aprovação...");
			if (Util.isNull(rmDAO.obterUltimaAprovacao(idColigada, idMovimento))) {
				
				LOG.info("[iniciarAprovacao] Obtendo movimento...");
				MovimentoDTO movimento = rmDAO.obterMovimento(idMovimento, idColigada);
				
				if (Util.isNotNull(movimento)) {
					LOG.info("[iniciarAprovacao] Obtendo lotação...");
					String lotacao = rmDAO.obterLotacao(idColigada, movimento.getIdCentroCusto());
					if (movimento.getStatus().equals("A") 
							&& !movimento.getIdTipoMovimento().equals("1.1.27") 
							&& !movimento.getIdTipoMovimento().equals("1.1.28")
							&& Util.isNotNull(lotacao)) {
						
						LOG.info("[iniciarAprovacao] Obtendo primeiro e segundo aprovadores...");
						List<AprovadorDTO> primeiroAprovadores = this.rmDAO.obterPrimeiroAprovadores(lotacao);
						List<AprovadorDTO> segundoAprovadores = this.rmDAO.obterSegundoAprovadores(lotacao);
						String nomePrimeiroAprovador = "";
						String nomeSegundoAprovador = "";
						AprovadorDTO primeiroAprovador = new AprovadorDTO();
						AprovadorDTO segundoAprovador = new AprovadorDTO();
						Double valorCompra = Util.removerFomatacaoMoeda(movimento.getValorTotal());
						if (valorCompra <= 15000.0) {
							for (AprovadorDTO aprv : primeiroAprovadores) {
								if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 0 && aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != -1) {
									primeiroAprovador = aprv;
									LOG.info("[iniciarAprovacao] Obtendo nome do primeiro aprovador...");
									nomePrimeiroAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
								}
							}
							for (AprovadorDTO aprv : segundoAprovadores) {
								if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 0 && aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != -1) {
									segundoAprovador = aprv;
									LOG.info("[iniciarAprovacao] Obtendo nome do segundo aprovador...");
									nomeSegundoAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
								}
							}
						} else {
							for (AprovadorDTO aprv : primeiroAprovadores) {
								if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 1) {
									primeiroAprovador = aprv;
									LOG.info("[iniciarAprovacao] Obtendo nome do primeiro aprovador...");
									nomePrimeiroAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
								}
							}
							for (AprovadorDTO aprv : segundoAprovadores) {
								if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 1) {
									segundoAprovador = aprv;
									LOG.info("[iniciarAprovacao] Obtendo nome do segundo aprovador...");
									nomeSegundoAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
								}
							}
						}
						LOG.info("[iniciarAprovacao] Incluindo monitor de aprovação...");
						this.rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
								movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(),
								AGUARDANDO_APROVACAO, null, null, Calendar.getInstance().getTime(),
								segundoAprovador.getUsuarioAprovacao(), movimento.getUsrSolicitante(),
								Calendar.getInstance().getTime(), null, null);
						
						LOG.info("[iniciarAprovacao] Iniciando processo no Fluig...");
						this.fluigBusiness.iniciarProcessoFluig("leonan", "123", 1,
								primeiroAprovador.getUsuarioAprovacao(), nomePrimeiroAprovador.toUpperCase(),
								movimento.getIdColigada().toString(), movimento.getIdMov().toString(),
								segundoAprovador.getUsuarioAprovacao(), nomeSegundoAprovador.toUpperCase());
						return "OK";
					}
				} else {
					return "MOVIMENTO NÃO EXISTE";
				}
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return "OK";
	}
}