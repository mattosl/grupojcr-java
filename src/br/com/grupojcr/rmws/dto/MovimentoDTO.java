package br.com.grupojcr.rmws.dto;

import java.util.List;

public class MovimentoDTO {

	private Integer idColigada;
	private String nomeEmpresa;
	private String solicitante;
	private String usrSolicitante;
	private Integer idMov;
	private String idFornecedor;
	private String fornecedor;
	private String idCondicaoPagamento;
	private String condicaoPagamento;
	private String moeda;
	private String valorTotal;
	private String idCentroCusto;
	private String centroCusto;
	private String observacao;
	private String dataEmissao;
	private String idTipoMovimento;
	private String tipoMovimento;
	private String status;
	private String dtPrimeiraAprovacao;
	private String dtSegundaAprovacao;
	private String situacaoMonitor;
	private String dtUltimaAprovacao;
	private List<ItemDTO> listaItem;

	public Integer getIdColigada() {
		return idColigada;
	}

	public void setIdColigada(Integer idColigada) {
		this.idColigada = idColigada;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Integer getIdMov() {
		return idMov;
	}

	public void setIdMov(Integer idMov) {
		this.idMov = idMov;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getIdCondicaoPagamento() {
		return idCondicaoPagamento;
	}

	public void setIdCondicaoPagamento(String idCondicaoPagamento) {
		this.idCondicaoPagamento = idCondicaoPagamento;
	}

	public String getCondicaoPagamento() {
		return condicaoPagamento;
	}

	public void setCondicaoPagamento(String condicaoPagamento) {
		this.condicaoPagamento = condicaoPagamento;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
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

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public List<ItemDTO> getListaItem() {
		return listaItem;
	}

	public void setListaItem(List<ItemDTO> listaItem) {
		this.listaItem = listaItem;
	}

	public String getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(String idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	@Override
	public String toString() {
		return "MovimentoDTO [idColigada=" + idColigada + ", nomeEmpresa=" + nomeEmpresa + ", solicitante="
				+ solicitante + ", idMov=" + idMov + ", idFornecedor=" + idFornecedor + ", fornecedor=" + fornecedor
				+ ", idCondicaoPagamento=" + idCondicaoPagamento + ", condicaoPagamento=" + condicaoPagamento
				+ ", moeda=" + moeda + ", valorTotal=" + valorTotal + ", idCentroCusto=" + idCentroCusto
				+ ", centroCusto=" + centroCusto + ", observacao=" + observacao + ", dataEmissao=" + dataEmissao
				+ ", listaItem=" + listaItem + "]";
	}

	public String getUsrSolicitante() {
		return usrSolicitante;
	}

	public void setUsrSolicitante(String usrSolicitante) {
		this.usrSolicitante = usrSolicitante;
	}

	public String getIdTipoMovimento() {
		return idTipoMovimento;
	}

	public void setIdTipoMovimento(String idTipoMovimento) {
		this.idTipoMovimento = idTipoMovimento;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDtPrimeiraAprovacao() {
		return dtPrimeiraAprovacao;
	}

	public void setDtPrimeiraAprovacao(String dtPrimeiraAprovacao) {
		this.dtPrimeiraAprovacao = dtPrimeiraAprovacao;
	}

	public String getDtSegundaAprovacao() {
		return dtSegundaAprovacao;
	}

	public void setDtSegundaAprovacao(String dtSegundaAprovacao) {
		this.dtSegundaAprovacao = dtSegundaAprovacao;
	}

	public String getSituacaoMonitor() {
		return situacaoMonitor;
	}

	public void setSituacaoMonitor(String situacaoMonitor) {
		this.situacaoMonitor = situacaoMonitor;
	}

	public String getDtUltimaAprovacao() {
		return dtUltimaAprovacao;
	}

	public void setDtUltimaAprovacao(String dtUltimaAprovacao) {
		this.dtUltimaAprovacao = dtUltimaAprovacao;
	}

}
