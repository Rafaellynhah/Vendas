package com.prova.p_corporativos.Model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compra")
public class Compra extends AbstractEntity {

	private int nota_fiscal;
	
    @ManyToOne
    @JoinColumn(name = "comprador_id")
    private Comprador comprador;

	
	@OneToOne
    @JoinColumn(name = "ordemfornecimento_id")
	private OrdemDeFornecimento ordemDeFornecimento;
	

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}


	public OrdemDeFornecimento getOrdemDeFornecimento() {
		return ordemDeFornecimento;
	}

	public void setOrdemDeFornecimento(OrdemDeFornecimento ordemDeFornecimento) {
		this.ordemDeFornecimento = ordemDeFornecimento;
	}

	public int getNota_fiscal() {
		return nota_fiscal;
	}

	public void setNota_fiscal(int nota_fiscal) {
		this.nota_fiscal = nota_fiscal;
	}

	
	
	
}
