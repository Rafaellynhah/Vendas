package com.prova.p_corporativos.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ordemfornecimento")
public class OrdemDeFornecimento extends AbstractEntity {

	private float vl_total;
	private int qtd_solicitada;
	
	@OneToOne
    @JoinColumn(name = "cotacao_id")
    private Cotacao cotacao;
	

	public float getVl_total() {
		return vl_total;
	}

	public void setVl_total(float vl_total) {
		this.vl_total = vl_total;
	}

	public int getQtd_solicitada() {
		return qtd_solicitada;
	}

	public void setQtd_solicitada(int qtd_solicitada) {
		this.qtd_solicitada = qtd_solicitada;
	}

	public Cotacao getCotacao() {
		return cotacao;
	}

	public void setCotacao(Cotacao cotacao) {
		this.cotacao = cotacao;
	}
    
	
	
	
}
