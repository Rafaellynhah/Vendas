package com.prova.p_corporativos.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import com.prova.p_corporativos.Model.BD_compra;
import com.prova.p_corporativos.Model.BD_OrdemFornecimento;

@Repository
public class CompraCustomRepository {

private final EntityManager em;
	
	public CompraCustomRepository(EntityManager em) {
		this.em = em;
	}
	
	public List<BD_compra> Compra() {
	
		
		String query = "SELECT cp.nm_fantasia, o.vl_total, f.razao, c.nota_fiscal, p.nome, p.preco_unitario, o.qtd_solicitada "
				+ "From Compra c, Produto p, Cotacao ct, Fornecedor f, OrdemDeFornecimento o, Comprador cp "
				+ "WHERE cp.id = c.comprador AND o.id = c.ordemDeFornecimento "
				+ "And ct.id = o.cotacao AND p.id = ct.produto AND f.id = p.fornecedor ";
		
		var q = em.createQuery(query);
		List<Object[]> objs = q.getResultList();

		List<BD_compra> compra = new ArrayList<BD_compra>();

		for (Object[] o : objs) {
	   
		     Object[] aux = o;
		     BD_compra c = new BD_compra();
		     String nm_fantasia=(String) aux[0];
		     float vl_total=(float) aux[1];
		     String razao=(String) aux[2];
		     int nota_fiscal=(int) aux[3];
		     String nome=(String) aux[4];
		     float preco=(float) aux[5];
		     int qtd=(int) aux[6];
		     c.setNm_comprador(nm_fantasia);
		     c.setVl_total(vl_total);
		     c.setFornecedor(razao);
		     c.setNota_fiscal(nota_fiscal);
		     c.setProduto(nome);
		     c.setVl_unitario(preco);
		     c.setQuantidade_Produto(qtd);
		     compra.add(c);
		
		}

		return compra;
	

	}
	
	
	
}
