package br.ce.hscastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.ce.hscastro.domain.Cliente;
import br.ce.hscastro.repositories.ClienteRepository;

//classe de serviços

@Service @Transactional(readOnly = false) 
public class ClienteServiceImpl implements ClienteService {

	@SuppressWarnings("unused")
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void save(Cliente cliente) {		
		clienteRepository.save(cliente);
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Cliente find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override @Transactional(readOnly = true)
	public List<Cliente> findAll() {		
		return clienteRepository.findAll();
	}

}
