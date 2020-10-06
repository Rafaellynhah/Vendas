package com.prova.p_corporativos.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cotacao")
public class Cotacao extends AbstractEntity{

	private float preco_final;
	
	private String prazo_entrega;
	
	private String prazo_pagamento;
	
	@OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
    

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public float getPreco_final() {
		return preco_final;
	}

	public void setPreco_final(float preco_final) {
		this.preco_final = preco_final;
	}

	public String getPrazo_entrega() {
		return prazo_entrega;
	}

	public void setPrazo_entrega(String prazo_entrega) {
		this.prazo_entrega = prazo_entrega;
	}

	public String getPrazo_pagamento() {
		return prazo_pagamento;
	}

	public void setPrazo_pagamento(String prazo_pagamento) {
		this.prazo_pagamento = prazo_pagamento;
	}
	
	
	
}
