package br.com.grupojcr.rmws.dto;

public class AprovacaoContratoDTO {
	
	private Integer idFluig;
	private String tipo;
	private Integer idCnt;
	private String nomeColigada;
	private String nomeFornecedor;
	private String codigoCentroCusto;
	private String centroCusto;
	private String valor;
	private String requisitante;
	private Integer sequenciaMovimento;
	
	public Integer getIdCnt() {
		return idCnt;
	}
	public void setIdCnt(Integer idCnt) {
		this.idCnt = idCnt;
	}
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
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
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
	

}
