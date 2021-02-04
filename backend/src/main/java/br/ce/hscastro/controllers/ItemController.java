package br.ce.hscastro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ce.hscastro.domain.Item;
import br.ce.hscastro.repositories.ItemRepository;

@RestController
@RequestMapping("/itens")
public class ItemController {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping
	public List<Item> listar(){
		return  itemRepository.findAll();
	}
}
