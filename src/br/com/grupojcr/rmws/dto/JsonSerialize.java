package br.com.grupojcr.rmws.dto;

import com.google.gson.annotations.SerializedName;

public class JsonSerialize {

	@SerializedName("idColigada")
	private Integer idColigada;
	@SerializedName("idMov")
	private Integer idMovimento;
	@SerializedName("statusAprovacao")
	private Integer statusAprovacao;
	@SerializedName("observacao")
	private String observacao;
	@SerializedName("aprovador")
	private Integer aprovador;
	@SerializedName("usrAprovador")
	private String usuarioAprovou;
	@SerializedName("observacaoPrimeiroAprovador")
	private String observacaoPrimeiroAprovador;
	@SerializedName("observacaoSegundoAprovador")
	private String observacaoSegundoAprovador;
	@SerializedName("usuarioLogado")
	private String usuarioLogado;
	@SerializedName("periodoInicial")
	private String periodoInicial;
	@SerializedName("periodoFinal")
	private String periodoFinal;
	
	public Integer getIdColigada() {
		return idColigada;
	}
	public void setIdColigada(Integer idColigada) {
		this.idColigada = idColigada;
	}
	public Integer getIdMovimento() {
		return idMovimento;
	}
	public void setIdMovimento(Integer idMovimento) {
		this.idMovimento = idMovimento;
	}
	public Integer getStatusAprovacao() {
		return statusAprovacao;
	}
	public void setStatusAprovacao(Integer statusAprovacao) {
		this.statusAprovacao = statusAprovacao;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Integer getAprovador() {
		return aprovador;
	}
	public void setAprovador(Integer aprovador) {
		this.aprovador = aprovador;
	}
	public String getUsuarioAprovou() {
		return usuarioAprovou;
	}
	public void setUsuarioAprovou(String usuarioAprovou) {
		this.usuarioAprovou = usuarioAprovou;
	}
	public String getObservacaoPrimeiroAprovador() {
		return observacaoPrimeiroAprovador;
	}
	public void setObservacaoPrimeiroAprovador(String observacaoPrimeiroAprovador) {
		this.observacaoPrimeiroAprovador = observacaoPrimeiroAprovador;
	}
	public String getObservacaoSegundoAprovador() {
		return observacaoSegundoAprovador;
	}
	public void setObservacaoSegundoAprovador(String observacaoSegundoAprovador) {
		this.observacaoSegundoAprovador = observacaoSegundoAprovador;
	}
	public String getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(String usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}
	public String getPeriodoInicial() {
		return periodoInicial;
	}
	public void setPeriodoInicial(String periodoInicial) {
		this.periodoInicial = periodoInicial;
	}
	public String getPeriodoFinal() {
		return periodoFinal;
	}
	public void setPeriodoFinal(String periodoFinal) {
		this.periodoFinal = periodoFinal;
	}
}
