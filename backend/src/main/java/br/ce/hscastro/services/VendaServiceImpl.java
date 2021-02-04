package br.ce.hscastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ce.hscastro.domain.Venda;
import br.ce.hscastro.repositories.VendaRepository;

@Service @Transactional(readOnly = false) 
public class VendaServiceImpl implements VendaService {

	@SuppressWarnings("unused")
	@Autowired
	private VendaRepository vendaRepository;
	
	@Override
	public Venda salvar(Venda venda) {		
		return vendaRepository.save(venda);
	}

	@Override
	public void editar(Venda venda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Venda buscar(Long id) {
		Optional<Venda> v = vendaRepository.findById(id);
		return v.get();
	}

	@Override @Transactional(readOnly = true)
	public List<Venda> listar() {
		return vendaRepository.findAll();
	}


}
