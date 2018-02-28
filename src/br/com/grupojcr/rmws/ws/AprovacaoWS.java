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

	@WebMethod
	public String iniciarAprovacao(@WebParam(name = "movimento") Integer idMovimento,
			@WebParam(name = "coligada") Integer idColigada) {
		if (Util.isNull((Object) this.rmDAO.obterUltimaAprovacao(idColigada, idMovimento))) {
			MovimentoDTO movimento = this.rmDAO.obterMovimento(idMovimento, idColigada);
			if (Util.isNotNull((Object) movimento)) {
				String lotacao;
				if (movimento.getStatus().equals("A") && !movimento.getIdTipoMovimento().equals("1.1.27")
						&& !movimento.getIdTipoMovimento().equals("1.1.28")
						&& Util.isNotNull((Object) (lotacao = this.rmDAO.obterLotacao(idColigada,
								movimento.getIdCentroCusto())))) {
					List<AprovadorDTO> primeiroAprovadores = this.rmDAO.obterPrimeiroAprovadores(lotacao);
					List<AprovadorDTO> segundoAprovadores = this.rmDAO.obterSegundoAprovadores(lotacao);
					String nomePrimeiroAprovador = "";
					String nomeSegundoAprovador = "";
					AprovadorDTO primeiroAprovador = new AprovadorDTO();
					AprovadorDTO segundoAprovador = new AprovadorDTO();
					Double valorCompra = Util.removerFomatacaoMoeda((String) movimento.getValorTotal());
					if (valorCompra <= 15000.0) {
						for (AprovadorDTO aprv : primeiroAprovadores) {
							if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 0
									&& aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != -1)
								continue;
							primeiroAprovador = aprv;
							nomePrimeiroAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
						}
						for (AprovadorDTO aprv : segundoAprovadores) {
							if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 0
									&& aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != -1)
								continue;
							segundoAprovador = aprv;
							nomeSegundoAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
						}
						this.rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
								movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(), AGUARDANDO_APROVACAO,
								null, null, Calendar.getInstance().getTime(), primeiroAprovador.getUsuarioAprovacao(),
								movimento.getUsrSolicitante(), Calendar.getInstance().getTime(), null, null);
						this.fluigBusiness.iniciarProcessoFluig("leonan", "123", Integer.valueOf(1),
								primeiroAprovador.getUsuarioAprovacao(), nomePrimeiroAprovador.toUpperCase(),
								movimento.getIdColigada().toString(), movimento.getIdMov().toString(),
								segundoAprovador.getUsuarioAprovacao(), nomeSegundoAprovador.toUpperCase());
						return "Processo Fluig criado com sucesso!";
					}
					for (AprovadorDTO aprv : primeiroAprovadores) {
						if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 1)
							continue;
						primeiroAprovador = aprv;
						nomePrimeiroAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
					}
					for (AprovadorDTO aprv : segundoAprovadores) {
						if (aprv.getValorFinalMovimento().compareTo(new BigDecimal(15000.0)) != 1)
							continue;
						segundoAprovador = aprv;
						nomeSegundoAprovador = this.rmDAO.obterNomeAprovador(aprv.getUsuarioAprovacao());
					}
					this.rmDAO.incluirMonitorAprovacao(movimento.getIdColigada(), movimento.getIdMov(),
							movimento.getIdTipoMovimento(), movimento.getUsrSolicitante(),
							AGUARDANDO_APROVACAO, null, null, Calendar.getInstance().getTime(),
							segundoAprovador.getUsuarioAprovacao(), movimento.getUsrSolicitante(),
							Calendar.getInstance().getTime(), null, null);
					this.fluigBusiness.iniciarProcessoFluig("leonan", "123", Integer.valueOf(1),
							primeiroAprovador.getUsuarioAprovacao(), nomePrimeiroAprovador.toUpperCase(),
							movimento.getIdColigada().toString(), movimento.getIdMov().toString(),
							segundoAprovador.getUsuarioAprovacao(), nomeSegundoAprovador.toUpperCase());
					return "Processo Fluig criado com sucesso!";
				}
			} else {
				LOG.error("Não existe movimento");
			}
		}
		LOG.error("Não existe movimento");
		return "Processo Finalizado";
	}
}