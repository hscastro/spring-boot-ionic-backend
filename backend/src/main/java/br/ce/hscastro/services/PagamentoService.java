package br.ce.hscastro.services;

import java.util.List;

import br.ce.hscastro.domain.Pagamento;

public interface PagamentoService {

	public Pagamento salvar(Pagamento pagamento);
	public void editar(Pagamento pagamento);
	public void excluir(Long id);
	public Pagamento buscar(Long id);
	public List<Pagamento> listar();
}
