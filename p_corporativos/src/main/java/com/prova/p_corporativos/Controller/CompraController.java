package com.prova.p_corporativos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.p_corporativos.Model.BD_compra;
import com.prova.p_corporativos.Repository.CompraCustomRepository;
import com.prova.p_corporativos.Repository.CompraRepository;

@RestController
public class CompraController {

	private final CompraCustomRepository cc;
	private final CompraRepository cr;

	@Autowired
	public CompraController(CompraCustomRepository cc, CompraRepository cr) {
		this.cc=cc;
		this.cr=cr;
		
	}
	
	
	@GetMapping("/compra")
	public List<BD_compra> Compra() {

		return cc.Compra();
			
	}
	
}
