package br.ce.hscastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.ce.hscastro.domain.Cliente;
import br.ce.hscastro.repositories.ClienteRepository;

@Service @Transactional(readOnly = false) 
public class ClienteServiceImpl implements ClienteService {

	@SuppressWarnings("unused")
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void salvar(Cliente cliente) {		
		clienteRepository.save(cliente);
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Cliente buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override @Transactional(readOnly = true)
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
