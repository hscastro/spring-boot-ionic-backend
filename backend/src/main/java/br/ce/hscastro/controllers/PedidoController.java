package br.ce.hscastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ce.hscastro.domain.Pedido;
import br.ce.hscastro.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Long id){
		Pedido pedido = service.find(id);
		return ResponseEntity.ok().body(pedido);
	}
	
	@GetMapping
	public List<Pedido> findAll(){
		return  service.findAll();
	}
	
	@PostMapping
	public Pedido adicionar(@RequestBody Pedido pedido){
		return service.save(pedido);
	}
}
