package br.com.grupojcr.rmws.dto;

import java.util.Date;

public class MonitorAprovacaoDTO {

	private String situacao;
	private String usuarioAprovou;
	private Date dtAprovacao;
	private String observacao;
	private String nomeUsuario;

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getUsuarioAprovou() {
		return usuarioAprovou;
	}

	public void setUsuarioAprovou(String usuarioAprovou) {
		this.usuarioAprovou = usuarioAprovou;
	}

	public Date getDtAprovacao() {
		return dtAprovacao;
	}

	public void setDtAprovacao(Date dtAprovacao) {
		this.dtAprovacao = dtAprovacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

}
