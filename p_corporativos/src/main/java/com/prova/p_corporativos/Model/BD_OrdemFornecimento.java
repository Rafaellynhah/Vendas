package com.prova.p_corporativos.Model;

public class BD_OrdemFornecimento {

	private String nm_fantasia;
	
	private float preco_unitario;
	
	private String prazo_entrega;
	
	private Long cotacao_id;

	private Cotacao cotacao;
	
	public String getNm_fantasia() { return nm_fantasia; }
	  
	public void setNm_fantasia(String nm_fantasia) { this.nm_fantasia =
	nm_fantasia; }
	 

	public Long getCotacao_id() {
		return cotacao_id;
	}

	public void setCotacao_id(Long cotacao_id) {
		this.cotacao_id = cotacao_id;
	}

	public String getPrazo_entrega() {
		return prazo_entrega;
	}

	public float getPreco_unitario() {
		return preco_unitario;
	}

	public void setPreco_unitario(float preco_unitario) {
		this.preco_unitario = preco_unitario;
	}

	public void setPrazo_entrega(String prazo_entrega) {
		this.prazo_entrega = prazo_entrega;
	}
	
	public Cotacao getCotacao() {
		return cotacao;
	}

	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
    

}
