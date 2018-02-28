package br.com.grupojcr.rmws.dto;

import java.math.BigDecimal;

public class AprovadorDTO {
	
	private String usuarioAprovacao;
	private BigDecimal valorInicialMovimento;
	private BigDecimal valorFinalMovimento;
	private BigDecimal valorInicialContrato;
	private BigDecimal valorFinalContrato;
	private Integer idColigada;
	private String lotacao;
	
	public String getUsuarioAprovacao() {
		return usuarioAprovacao;
	}
	public void setUsuarioAprovacao(String usuarioAprovacao) {
		this.usuarioAprovacao = usuarioAprovacao;
	}
	public BigDecimal getValorInicialMovimento() {
		return valorInicialMovimento;
	}
	public void setValorInicialMovimento(BigDecimal valorInicialMovimento) {
		this.valorInicialMovimento = valorInicialMovimento;
	}
	public BigDecimal getValorFinalMovimento() {
		return valorFinalMovimento;
	}
	public void setValorFinalMovimento(BigDecimal valorFinalMovimento) {
		this.valorFinalMovimento = valorFinalMovimento;
	}
	public BigDecimal getValorInicialContrato() {
		return valorInicialContrato;
	}
	public void setValorInicialContrato(BigDecimal valorInicialContrato) {
		this.valorInicialContrato = valorInicialContrato;
	}
	public BigDecimal getValorFinalContrato() {
		return valorFinalContrato;
	}
	public void setValorFinalContrato(BigDecimal valorFinalContrato) {
		this.valorFinalContrato = valorFinalContrato;
	}
	public Integer getIdColigada() {
		return idColigada;
	}
	public void setIdColigada(Integer idColigada) {
		this.idColigada = idColigada;
	}
	public String getLotacao() {
		return lotacao;
	}
	public void setLotacao(String lotacao) {
		this.lotacao = lotacao;
	}
	@Override
	public String toString() {
		return "AprovadorDTO [usuarioAprovacao=" + usuarioAprovacao + ", valorInicialMovimento=" + valorInicialMovimento
				+ ", valorFinalMovimento=" + valorFinalMovimento + ", valorInicialContrato=" + valorInicialContrato
				+ ", valorFinalContrato=" + valorFinalContrato + ", idColigada=" + idColigada + ", lotacao=" + lotacao
				+ "]";
	}
	

}
