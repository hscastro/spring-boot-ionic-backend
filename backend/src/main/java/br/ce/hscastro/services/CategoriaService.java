package br.ce.hscastro.services;

import java.util.List;

import br.ce.hscastro.domain.Categoria;

public interface CategoriaService {

	public Categoria insert(Categoria obj);	
	public void editar(Categoria categoria);
	public void excluir(Long id);
	public Categoria buscar(Long id);
	public List<Categoria> listar();
	
}
