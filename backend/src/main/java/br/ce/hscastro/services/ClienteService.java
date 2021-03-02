package br.ce.hscastro.services;

import java.util.List;

import br.ce.hscastro.domain.Cliente;

//interface de serviços de CategoriaService

public interface ClienteService {

	public void save(Cliente cliente);
	public void update(Cliente cliente);
	public void delete(Long id);
	public Cliente find(Long id);
	public List<Cliente> findAll();	
}
