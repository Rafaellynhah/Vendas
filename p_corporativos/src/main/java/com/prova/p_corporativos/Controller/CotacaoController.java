package com.prova.p_corporativos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.p_corporativos.Model.Cotacao;
import com.prova.p_corporativos.Model.Produto;
import com.prova.p_corporativos.Repository.CotacaoCustomRepository;
import com.prova.p_corporativos.Repository.CotacaoRepository;

@RestController
public class CotacaoController {

	private final CotacaoRepository cr;
	private final CotacaoCustomRepository c;

	@Autowired
	public CotacaoController(CotacaoRepository cr, CotacaoCustomRepository c) {
		this.cr = cr;
		this.c=c;
		
	}
	
	
	@GetMapping("/cotacao")
	public List<Produto> AddCotacaoFornecedor() {
		
		for (Produto p : c.CotacaoFornecedor()) {
			
			Cotacao c = new Cotacao();
			
			c.setPreco_final(p.getPreco_unitario());
			c.setPrazo_entrega("15/10/2020");
			c.setPrazo_pagamento("15/10/2020");
			c.setProduto(p);
			cr.save(c);
			
		}
		
		return c.CotacaoFornecedor();
		
	}
	
	
	
}
