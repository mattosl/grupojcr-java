package br.com.grupojcr.rmws.business;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;

import com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceLocator;
import com.totvs.technology.ecm.dm.ws.ECMDashBoardServiceServiceSoapBindingStub;
import com.totvs.technology.ecm.dm.ws.WorkflowProcessDto;
import com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceLocator;
import com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceSoapBindingStub;

import br.com.grupojcr.rmws.dao.RMDAO;
import br.com.grupojcr.rmws.dto.AprovacaoContratoDTO;
import br.com.grupojcr.rmws.dto.AprovacaoOrdemCompraDTO;
import br.com.grupojcr.rmws.dto.SolicitacaoAprovacaoDTO;
import br.com.grupojcr.rmws.dto.ZMDRMFLUIGDTO;
import br.com.grupojcr.rmws.util.TreatString;
import br.com.grupojcr.rmws.util.Util;

@Stateless
public class FluigBusiness {

	protected static Logger LOG = Logger.getLogger(FluigBusiness.class);
	
	@EJB
	private RMDAO rmDAO;

	/**
	 * Método responsável por obter proxy do WS SOAP do fluig ECMWorkFlowEngineService
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @return ECMWorkflowEngineServiceServiceSoapBindingStub
	 */
	private ECMWorkflowEngineServiceServiceSoapBindingStub obterProxyECMWorkFlowEngineService() throws ServiceException {
		LOG.info("[obterProxyECMWorkFlowEngineService] Método iniciado.");
		try {
			ECMWorkflowEngineServiceServiceLocator locator = new ECMWorkflowEngineServiceServiceLocator();
			ECMWorkflowEngineServiceServiceSoapBindingStub cliente = (ECMWorkflowEngineServiceServiceSoapBindingStub) locator
					.getWorkflowEngineServicePort();
			LOG.info("[obterProxyECMWorkFlowEngineService] Stub obtido.");
			return cliente;
		} catch (Exception e) {
			LOG.error(e.getStackTrace());
			throw e;
		}
	}
	
	/**
	 * Método responsável por obter proxy do WS SOAP do fluig ECMDashBoardService
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 04/05/2018
	 * @return ECMDashBoardServiceServiceSoapBindingStub
	 */
	private ECMDashBoardServiceServiceSoapBindingStub obterProxyECMDashBoardService() throws ServiceException {
		LOG.info("[obterProxyECMDashBoardService] Método iniciado.");
		try {
			ECMDashBoardServiceServiceLocator locator = new ECMDashBoardServiceServiceLocator();
			ECMDashBoardServiceServiceSoapBindingStub cliente = (ECMDashBoardServiceServiceSoapBindingStub) locator
					.getDashBoardServicePort();
			LOG.info("[obterProxyECMDashBoardService] Stub obtido.");
			return cliente;
		} catch (Exception e) {
			LOG.error(e.getStackTrace());
			throw e;
		}
	}

	/**
	 * Método responsável por iniciar processo no FLUIG
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @param usuario : String
	 * @param senha : String
	 * @param company : Integer
	 * @param usrAprova : String
	 * @param nomePrimeiroAprovador : String
	 * @param idColigada : String
	 * @param idMovimento : String
	 * @param segundoAprovador : String
	 * @param nomeSegundoAprovador : String
	 */
	public void iniciarProcessoFluig(String usuario, String senha, Integer company, String usrAprova,
			String nomePrimeiroAprovador, String idColigada, String idMovimento, String segundoAprovador,
			String nomeSegundoAprovador) {
		LOG.info("[iniciarProcessoFluig] Método iniciado.");
		try {
			LOG.info("[iniciarProcessoFluig] Obtendo proxy do WS...");
			ECMWorkflowEngineServiceServiceSoapBindingStub cliente = obterProxyECMWorkFlowEngineService();

			LOG.info("[iniciarProcessoFluig] Iniciando processo no FLUIG...");
			cliente.startProcess(usuario, senha, 1, "AprovacaoOrdemCompra", 5,
					new String[] { "leonardo" }, null, usuario, true, null,
					new String[][] { { "codcoligada", idColigada }, { "idmov", idMovimento },
							{ "mat_aprovador1", "leonardo" }, { "mat_aprovador2", "leonardo" },
							{ "desc_aprovador1", nomePrimeiroAprovador }, { "desc_aprovador2", nomeSegundoAprovador },
							{ "status_aprov1", "AGUARDANDO APROVAÇÃO" }, { "status_aprov2", "AGUARDANDO APROVAÇÃO" } },
					null, false);
		} catch (Exception e) {
			LOG.error(e.getStackTrace());
		}
	}
	
	public SolicitacaoAprovacaoDTO listarSolicitacoesAprovacao(String usuario) {
		try {
			if(TreatString.isNotBlank(usuario)) {
				ECMDashBoardServiceServiceSoapBindingStub cliente = obterProxyECMDashBoardService();
				WorkflowProcessDto[] solicitacoes = cliente.findWorkflowTasks("fluig_admin", "Flu1g@dm1m", 1, usuario);
				
				SolicitacaoAprovacaoDTO solicitacao = new SolicitacaoAprovacaoDTO();
				solicitacao.setContratos(new ArrayList<AprovacaoContratoDTO>());
				solicitacao.setOrdemCompras(new ArrayList<AprovacaoOrdemCompraDTO>());
				Integer qtdContrato = 0;
				Integer qtdOrdemCompra = 0;
				
				if(solicitacoes.length > 0) {
					for(int i = 0; i < solicitacoes.length; i++) {
						ZMDRMFLUIGDTO rmFluig = rmDAO.obterLigacaoRMFluig(solicitacoes[i].getProcessInstanceId());
						
						if(rmFluig != null) {
							
							if(Util.isNotNull(rmFluig.getIdCnt()) && !Util.isNullOrZero(rmFluig.getIdCnt())) {
								AprovacaoContratoDTO contrato = rmDAO.obterContrato(rmFluig.getIdCnt(), rmFluig.getIdColigada());
								contrato.setIdFluig(solicitacoes[i].getProcessInstanceId());
								contrato.setTipo(solicitacoes[i].getStateDescription());
								contrato.setSequenciaMovimento(solicitacoes[i].getMovementSequence());
								solicitacao.getContratos().add(contrato);
								qtdContrato++;
							} else if(Util.isNotNull(rmFluig.getIdMovimento()) && !Util.isNullOrZero(rmFluig.getIdMovimento())) {
								AprovacaoOrdemCompraDTO ordemCompra = rmDAO.obterOrdemCompra(rmFluig.getIdMovimento(), rmFluig.getIdColigada());
								ordemCompra.setIdFluig(solicitacoes[i].getProcessInstanceId());
								ordemCompra.setTipo(solicitacoes[i].getStateDescription());
								ordemCompra.setSequenciaMovimento(solicitacoes[i].getMovementSequence());
								solicitacao.getOrdemCompras().add(ordemCompra);
								qtdOrdemCompra++;
							}
						}
					}
				}
				
				solicitacao.setQtdContratos(qtdContrato);
				solicitacao.setQtdOrdemCompra(qtdOrdemCompra);
				
				if(qtdContrato > 0) {
					solicitacao.setClasseCSSContratos("badge-danger");
				} else {
					solicitacao.setClasseCSSContratos("");
				}
				
				if(qtdOrdemCompra > 0) {
					solicitacao.setClasseCSSOrdemCompra("badge-danger");
				} else {
					solicitacao.setClasseCSSOrdemCompra("");
				}
				
				return solicitacao;
			}
		} catch (Exception e) {
			LOG.error(e.getStackTrace());
		}
		return null;
	}

}
