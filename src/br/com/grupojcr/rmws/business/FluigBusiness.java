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
	 * 
	 * Método responsável por obter stub do cliente WS - ECMWorkflowEngine
	 *
	 * @since 18 de fev de 2018 14:26:23 (Projeto)
	 * @author Leonan Mattos - <leonan.mattos@sigma.com.br>
	 * @since 18 de fev de 2018 14:26:23 (Implementação)
	 * @author Leonan Mattos - <leonan.mattos@sigma.com.br>
	 * @return
	 * @throws ServiceException
	 *
	 * @rastreabilidade_requisito
	 */
	private ECMWorkflowEngineServiceServiceSoapBindingStub obterProxy() throws ServiceException {
		ECMWorkflowEngineServiceServiceLocator locator = new ECMWorkflowEngineServiceServiceLocator();
		ECMWorkflowEngineServiceServiceSoapBindingStub cliente = (ECMWorkflowEngineServiceServiceSoapBindingStub) locator
				.getWorkflowEngineServicePort();
		return cliente;
	}

	public void iniciarProcessoFluig(String usuario, String senha, Integer company, String usrAprova,
			String nomePrimeiroAprovador, String idColigada, String idMovimento, String segundoAprovador,
			String nomeSegundoAprovador) {
		try {
			ECMWorkflowEngineServiceServiceSoapBindingStub cliente = obterProxy();

			String[][] retorno = cliente.startProcess(usuario, senha, 1, "AprovacaoOrdemCompra", 5,
					new String[] { "leonardo" }, null, usuario, true, null,
					new String[][] { { "codcoligada", idColigada }, { "idmov", idMovimento },
							{ "mat_aprovador1", "leonardo" }, { "mat_aprovador2", "leonardo" },
							{ "desc_aprovador1", nomePrimeiroAprovador }, { "desc_aprovador2", nomeSegundoAprovador },
							{ "status_aprov1", "AGUARDANDO APROVAÇÃO" }, { "status_aprov2", "AGUARDANDO APROVAÇÃO" } },
					null, false);
			System.out.println(retorno[5][2]);
		} catch (ServiceException e) {
			LOG.error(e.getStackTrace());
		} catch (Exception e) {
			LOG.error(e.getStackTrace());
		}
	}

}
