package com.prova.p_corporativos.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.prova.p_corporativos.Model.BD_OrdemFornecimento;

@Repository
public class OrdemFornecimentoCustomRepository {

	private final EntityManager em;
	
	public OrdemFornecimentoCustomRepository(EntityManager em) {
		this.em = em;
	}
	
	public List<BD_OrdemFornecimento> OrdemFornecimento() {
		
		String query = "SELECT p.preco_unitario, c.prazo_entrega, f.nm_fantasia, c.id "
				+ " FROM Produto p, Cotacao c, Fornecedor f"
				+ " WHERE p.id = c.produto AND f.id = p.fornecedor";
		
		var q = em.createQuery(query);
		List<Object[]> objs = q.getResultList();

		List<BD_OrdemFornecimento> ordem = new ArrayList<BD_OrdemFornecimento>();

		for (Object[] o : objs) {
	   
		     Object[] aux = o;
		     BD_OrdemFornecimento r = new BD_OrdemFornecimento();
		     float preco=(float) aux[0];
		     String prazo=(String) aux[1];
		     String nome=(String) aux[2];
		     Long id=(Long) aux[3];
		     r.setPreco_unitario(preco);
		     r.setPrazo_entrega(prazo);
		     r.setNm_fantasia(nome);
		     r.setCotacao_id(id);
		     ordem.add(r);
		
		}

		return ordem;
	

	}
	
}
