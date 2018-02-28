package br.com.grupojcr.rmws.util;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@Stateless
public class HttpSessionUtil {

	HttpSession session;

	@PostConstruct
	public void init() {
		this.session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
	}

	public void adicionarAtributoNaSessao(String nomeDoAtributo, Object valorDoAtributo) {
		this.session.setAttribute(nomeDoAtributo, valorDoAtributo);
	}

	public Object obterAtributoNaSessao(String nomeDoAtributo) {
		return this.session.getAttribute(nomeDoAtributo);
	}

	public void removerAtributoNaSessao(String nomeDoAtributo) {
		this.session.removeAttribute(nomeDoAtributo);
	}

	public boolean existeAtributoNaSecao(String nomeDoAtributo) {
		return this.session.getAttribute(nomeDoAtributo) != null;
	}
}
