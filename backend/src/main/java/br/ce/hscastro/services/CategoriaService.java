package br.ce.hscastro.services;

import java.util.List;

import br.ce.hscastro.domain.Categoria;

public interface CategoriaService {

	public Categoria insert(Categoria obj);	
	public Categoria update(Categoria categoria);
	public void delete(Long id);
	public Categoria find(Long id);
	public List<Categoria> listar();
	
}
