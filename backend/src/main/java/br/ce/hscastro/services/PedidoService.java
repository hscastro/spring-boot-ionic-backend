package br.ce.hscastro.services;

import java.util.List;
import br.ce.hscastro.domain.Pedido;

public interface PedidoService {

	public Pedido save(Pedido pedido);
	public void update(Pedido pedido);
	public void delete(Long id);
	public Pedido find(Long id);
	public List<Pedido> findAll();
}
