package br.com.grupojcr.rmws.dto;

public class ItemDTO {
	
	private String idProduto;
	private String produto;
	private Integer quantidade;
	private String unidade;
	private String precoUnitario;
	private String moedaPreco;
	private String idNaturezaOrcamentaria;
	private String idCentroCusto;
	private String centroCusto;
	private String naturezaOrcamentaria;
	private String observacao;
	
	public String getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getMoedaPreco() {
		return moedaPreco;
	}
	public void setMoedaPreco(String moedaPreco) {
		this.moedaPreco = moedaPreco;
	}
	public String getIdNaturezaOrcamentaria() {
		return idNaturezaOrcamentaria;
	}
	public void setIdNaturezaOrcamentaria(String idNaturezaOrcamentaria) {
		this.idNaturezaOrcamentaria = idNaturezaOrcamentaria;
	}
	public String getNaturezaOrcamentaria() {
		return naturezaOrcamentaria;
	}
	public void setNaturezaOrcamentaria(String naturezaOrcamentaria) {
		this.naturezaOrcamentaria = naturezaOrcamentaria;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(String precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public String getIdCentroCusto() {
		return idCentroCusto;
	}
	public void setIdCentroCusto(String idCentroCusto) {
		this.idCentroCusto = idCentroCusto;
	}
	public String getCentroCusto() {
		return centroCusto;
	}
	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}
	@Override
	public String toString() {
		return "ItemDTO [idProduto=" + idProduto + ", produto=" + produto + ", quantidade=" + quantidade + ", unidade="
				+ unidade + ", precoUnitario=" + precoUnitario + ", moedaPreco=" + moedaPreco
				+ ", idNaturezaOrcamentaria=" + idNaturezaOrcamentaria + ", idCentroCusto=" + idCentroCusto
				+ ", centroCusto=" + centroCusto + ", naturezaOrcamentaria=" + naturezaOrcamentaria + ", observacao="
				+ observacao + "]";
	}

}
