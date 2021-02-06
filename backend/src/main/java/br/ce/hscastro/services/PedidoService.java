package br.ce.hscastro.services;

import java.util.List;
import br.ce.hscastro.domain.Pedido;

public interface PedidoService {

	public Pedido salvar(Pedido pedido);
	public void editar(Pedido pedido);
	public void excluir(Long id);
	public Pedido buscar(Long id);
	public List<Pedido> listar();
}
