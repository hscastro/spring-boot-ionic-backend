package br.ce.hscastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ce.hscastro.domain.Pedido;
import br.ce.hscastro.repositories.PedidoRepository;

@Service @Transactional(readOnly = false) 
public class PedidoServiceImpl implements PedidoService {

	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	public Pedido salvar(Pedido pedido) {		
		return pedidoRepository.save(pedido);
	}

	@Override
	public void editar(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Pedido buscar(Long id) {
		Optional<Pedido> v = pedidoRepository.findById(id);
		return v.get();
	}

	@Override @Transactional(readOnly = true)
	public List<Pedido> listar() {
		return pedidoRepository.findAll();
	}


}
