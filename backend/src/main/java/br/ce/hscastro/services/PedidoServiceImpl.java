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
	private PedidoRepository repository;
	
	@Override
	public Pedido save(Pedido pedido) {		
		return repository.save(pedido);
	}

	@Override
	public void update(Pedido pedido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Pedido find(Long id) {
		Optional<Pedido> v = repository.findById(id);
		return v.get();
	}

	@Override @Transactional(readOnly = true)
	public List<Pedido> findAll() {
		return repository.findAll();
	}


}
