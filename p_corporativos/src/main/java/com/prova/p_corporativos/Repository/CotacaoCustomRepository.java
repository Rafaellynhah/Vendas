package com.prova.p_corporativos.Repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.prova.p_corporativos.Model.Produto;

@Repository
public class CotacaoCustomRepository {

	private final EntityManager em;
	
	public CotacaoCustomRepository(EntityManager em) {
		this.em = em;
	}
	
	public List<Produto> CotacaoFornecedor() {
		
		String query = "SELECT p FROM Produto p WHERE preco_unitario = ( SELECT MIN(preco_unitario) FROM Produto)";
		
		var q = em.createQuery(query, Produto.class);
		
		return q.getResultList();
	}
	

}
