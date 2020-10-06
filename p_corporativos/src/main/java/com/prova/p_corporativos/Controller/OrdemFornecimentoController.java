package com.prova.p_corporativos.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.p_corporativos.Model.OrdemDeFornecimento;
import com.prova.p_corporativos.Model.BD_OrdemFornecimento;
import com.prova.p_corporativos.Model.Cotacao;
import com.prova.p_corporativos.Repository.OrdemFornecimentoCustomRepository;
import com.prova.p_corporativos.Repository.OrdemFornecimentoRepository;

@RestController
public class OrdemFornecimentoController {

	private final OrdemFornecimentoCustomRepository cc;
	private final OrdemFornecimentoRepository cr;

	@Autowired
	public OrdemFornecimentoController(OrdemFornecimentoCustomRepository cc, OrdemFornecimentoRepository cr) {
		this.cc=cc;
		this.cr=cr;
		
	}
	
	@GetMapping("/ordemfornecimento")
	public String OrdemFornecimento() {
		String ordem = null;
		
			OrdemDeFornecimento bd_od = new OrdemDeFornecimento();
			
			for (BD_OrdemFornecimento r : cc.OrdemFornecimento()) {

				bd_od.setQtd_solicitada(10);
				bd_od.setVl_total(bd_od.getQtd_solicitada() * r.getPreco_unitario());
				//bd_od.setCotacao();
				cr.save(bd_od);
			
				
				 ordem = "Ordem de fornecimento\r\n"
						+ "\r\n"
						+ "Solicitamos à Empresa " + r.getNm_fantasia() +" fornecer os materiais abaixo especificados.\r\n"
						+ "\r\n"
						+ "Quantidade: "+ bd_od.getQtd_solicitada() +"\r\n"
						+ "Preço Unitário: "+ r.getPreco_unitario() +"\r\n"
						+ "Preço total do item: "+ bd_od.getVl_total() +"\r\n"
						+ "Prazo entrega: "+ r.getPrazo_entrega() +"\r\n"
						+ "\r\n"
						+ "valor total da venda: R$ " + bd_od.getVl_total() + "\r\n"
						+ "\r\n"
						+ "Assinatura:____________________________________________\r\n"
						+ "\r\n";		
					
			
			}
			
			
		
		return ordem;
		
	}
	
}
