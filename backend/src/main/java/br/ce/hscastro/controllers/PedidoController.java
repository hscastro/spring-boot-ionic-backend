package br.ce.hscastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ce.hscastro.domain.Pedido;
import br.ce.hscastro.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	
	@GetMapping
	public List<Pedido> listar(){
		return  pedidoService.listar();
	}
	
	@PostMapping
	public Pedido adicionar(@RequestBody Pedido pedido){
		return pedidoService.salvar(pedido);
	}
}
