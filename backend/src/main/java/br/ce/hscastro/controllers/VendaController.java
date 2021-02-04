package br.ce.hscastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.ce.hscastro.domain.Venda;
import br.ce.hscastro.repositories.VendaRepository;
import br.ce.hscastro.services.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendaController {

	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> listar(){
		return  vendaRepository.findAll();
	}
	
	@PostMapping
	public Venda adicionar(@RequestBody Venda venda){
		return vendaService.salvar(venda);
	}
}
