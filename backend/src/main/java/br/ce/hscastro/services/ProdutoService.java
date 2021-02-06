package br.ce.hscastro.services;

import java.util.List;

import br.ce.hscastro.domain.Produto;

public interface ProdutoService {

	public Produto salvar(Produto produto);
	public void editar(Produto produto);
	public void excluir(Long id);
	public Produto buscar(Long id);
	public List<Produto> listar();
}
