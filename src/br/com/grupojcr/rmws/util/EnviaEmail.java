package br.com.grupojcr.rmws.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.annotation.Resource;
import javax.ejb.Asynchronous;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;
import javax.naming.InitialContext;

import org.apache.commons.io.IOUtils;

import br.com.grupojcr.rmws.dao.RMDAO;
import br.com.grupojcr.rmws.dto.MonitorAprovacaoDTO;
import br.com.grupojcr.rmws.dto.MovimentoDTO;

@Stateless
public class EnviaEmail {
	
	@EJB
	private RMDAO rmDAO;
	
	@Resource(name = "java:jboss/mail/MailService")
	private Session session;

	public EnviaEmail() {
	}

	@Asynchronous
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public void enviaEmailOrdemCompra(String assunto, String[] destinatariosPara, MovimentoDTO dto,
			MonitorAprovacaoDTO primeiraAprovacao, MonitorAprovacaoDTO segundaAprovacao) throws Exception {
		try {
			InitialContext ic = new InitialContext();
			session = ((Session) ic.lookup("java:jboss/mail/MailService"));

			InternetAddress[] destinatario = new InternetAddress[destinatariosPara.length];

			InternetAddress remetente = null;
			remetente = new InternetAddress("mattosl@grupojcr.com.br");

			for (int i = 0; i < destinatariosPara.length; i++) {
				destinatario[i] = new InternetAddress(destinatariosPara[i]);
			}

			Message message = new MimeMessage(session);
			message.setFrom(remetente);
			message.setRecipients(Message.RecipientType.TO, destinatario);
			message.setSubject(MimeUtility.encodeText(assunto, "UTF-8", null));

			BufferedReader fis = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream("/email.ordemcompra.html")));
			String bodyEmail = IOUtils.toString(fis);
			bodyEmail = bodyEmail.replace("${nome}", "João Carlos Ribeiro");
			bodyEmail = bodyEmail.replace("${empresa}", dto.getNomeEmpresa().toUpperCase());
			bodyEmail = bodyEmail.replace("${dtEmissao}", dto.getDataEmissao());
			bodyEmail = bodyEmail.replace("${identificadorRM}", dto.getIdMov().toString());
			bodyEmail = bodyEmail.replace("${fornecedor}",
					dto.getIdFornecedor() + " - " + dto.getFornecedor().toUpperCase());
			bodyEmail = bodyEmail.replace("${centroCusto}",
					dto.getIdCentroCusto() + " - " + dto.getCentroCusto().toUpperCase());
			bodyEmail = bodyEmail.replace("${valorTotal}", dto.getMoeda() + " " + dto.getValorTotal());
			bodyEmail = bodyEmail.replace("${nomePrimeiroAprovador}", primeiraAprovacao.getNomeUsuario().toUpperCase());
			bodyEmail = bodyEmail.replace("${nomeSegundoAprovador}", segundaAprovacao.getNomeUsuario().toUpperCase());
			bodyEmail = bodyEmail.replace("${dtPrimeiraAprovacao}",
					TreatDate.format("dd/MM/yyyy", primeiraAprovacao.getDtAprovacao()));
			bodyEmail = bodyEmail.replace("${dtSegundaAprovacao}",
					TreatDate.format("dd/MM/yyyy", segundaAprovacao.getDtAprovacao()));
			bodyEmail = bodyEmail.replace("${primeiraObservacao}", primeiraAprovacao.getObservacao());
			bodyEmail = bodyEmail.replace("${segundaObservacao}", segundaAprovacao.getObservacao());

			message.setContent(BrasilUtils.converterCaracteresEspeciaisHTML(bodyEmail), "text/html");

			Transport.send(message);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
