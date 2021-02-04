package br.ce.hscastro.services;

import java.util.List;

import br.ce.hscastro.domain.Cliente;

public interface ClienteService {

	public void salvar(Cliente cliente);
	public void editar(Cliente cliente);
	public void excluir(Long id);
	public Cliente buscar(Long id);
	public List<Cliente> listar();	
}
