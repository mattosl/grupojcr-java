package br.com.grupojcr.rmws.dto;

public class AprovacaoSolicitacaoCompraDTO {
	
	private Integer idFluig;
	private String tipo;
	private Integer numeroSolicitacao;
	private String nomeColigada;
	private String nomeFornecedor;
	private String codigoCentroCusto;
	private String centroCusto;
	private String requisitante;
	private Integer sequenciaMovimento;
	
	public String getNomeColigada() {
		return nomeColigada;
	}
	public void setNomeColigada(String nomeColigada) {
		this.nomeColigada = nomeColigada;
	}
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	public String getCodigoCentroCusto() {
		return codigoCentroCusto;
	}
	public void setCodigoCentroCusto(String codigoCentroCusto) {
		this.codigoCentroCusto = codigoCentroCusto;
	}
	public String getCentroCusto() {
		return centroCusto;
	}
	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}
	public String getRequisitante() {
		return requisitante;
	}
	public void setRequisitante(String requisitante) {
		this.requisitante = requisitante;
	}
	public Integer getIdFluig() {
		return idFluig;
	}
	public void setIdFluig(Integer idFluig) {
		this.idFluig = idFluig;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getSequenciaMovimento() {
		return sequenciaMovimento;
	}
	public void setSequenciaMovimento(Integer sequenciaMovimento) {
		this.sequenciaMovimento = sequenciaMovimento;
	}
	public Integer getNumeroSolicitacao() {
		return numeroSolicitacao;
	}
	public void setNumeroSolicitacao(Integer numeroSolicitacao) {
		this.numeroSolicitacao = numeroSolicitacao;
	}
	

}
