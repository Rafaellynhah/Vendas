package com.prova.p_corporativos.Model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor extends AbstractEntity {

	private String nm_fantasia;
	
	private String razao;
	
	@Column(length=14)
	private String cnpj;
	
	@Column(length=12)
	private String telefone;
	

	@OneToMany(mappedBy = "fornecedor")
	private List<Produto> produtos;
	
	public List<Produto> getProduto() {
	        return produtos;
	}
	

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}



	public String getNm_fantasia() {
		return nm_fantasia;
	}

	public void setNm_fantasia(String nm_fantasia) {
		this.nm_fantasia = nm_fantasia;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
}
