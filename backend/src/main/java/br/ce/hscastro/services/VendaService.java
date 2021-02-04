package br.ce.hscastro.services;

import java.util.List;
import br.ce.hscastro.domain.Venda;

public interface VendaService {

	public Venda salvar(Venda venda);
	public void editar(Venda venda);
	public void excluir(Long id);
	public Venda buscar(Long id);
	public List<Venda> listar();
}
