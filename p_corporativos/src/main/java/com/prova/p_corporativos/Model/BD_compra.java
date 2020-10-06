package com.prova.p_corporativos.Model;

public class BD_compra {

	private String nm_comprador;
	private String fornecedor;
	private int nota_fiscal;
	private float vl_total;
	private String produto;
	private float Vl_unitario;
	private int Quantidade_Produto;
	
	public int getQuantidade_Produto() {
		return Quantidade_Produto;
	}
	public void setQuantidade_Produto(int quantidade_Produto) {
		Quantidade_Produto = quantidade_Produto;
	}
	public float getVl_unitario() {
		return Vl_unitario;
	}
	public void setVl_unitario(float vl_unitario) {
		Vl_unitario = vl_unitario;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getNm_comprador() {
		return nm_comprador;
	}
	public void setNm_comprador(String nm_comprador) {
		this.nm_comprador = nm_comprador;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public int getNota_fiscal() {
		return nota_fiscal;
	}
	public void setNota_fiscal(int nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}
	public float getVl_total() {
		return vl_total;
	}
	public void setVl_total(float vl_total) {
		this.vl_total = vl_total;
	}
	
	
	
	
}
