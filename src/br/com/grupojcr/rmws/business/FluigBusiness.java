package br.com.grupojcr.rmws.business;

import javax.ejb.Stateless;
import javax.xml.rpc.ServiceException;

import org.apache.log4j.Logger;

import com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceLocator;
import com.totvs.technology.ecm.workflow.ws.ECMWorkflowEngineServiceServiceSoapBindingStub;

@Stateless
public class FluigBusiness {

	protected static Logger LOG = Logger.getLogger(FluigBusiness.class);

	/**
	 * Método responsável por obter proxy do WS SOAP do fluig ECMWorkFlowEngineService
	 * @author Leonan Yglecias Mattos - <mattosl@grupojcr.com.br>
	 * @since 01/02/2018
	 * @return ECMWorkflowEngineServiceServiceSoapBindingStub
	 */
	private ECMWorkflowEngineServiceServiceSoapBindingStub obterProxy() throws ServiceException {
		LOG.info("[obterProxy] Método iniciado.");
		try {
			ECMWorkflowEngineServiceServiceLocator locator = new ECMWorkflowEngineServiceServiceLocator();
			ECMWorkflowEngineServiceServiceSoapBindingStub cliente = (ECMWorkflowEngineServiceServiceSoapBindingStub) locator
					.getWorkflowEngineServicePort();
			LOG.info("[obterProxy] Stub obtido.");
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
			ECMWorkflowEngineServiceServiceSoapBindingStub cliente = obterProxy();

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

}
