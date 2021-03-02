package br.ce.hscastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ce.hscastro.domain.Pagamento;
import br.ce.hscastro.repositories.PagamentoRepository;

//classe de serviços

@Service @Transactional(readOnly = false) 
public class PagamentoServiceImpl implements PagamentoService {

	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Override
	public Pagamento salvar(Pagamento pagamento) {		
		return pagamentoRepository.save(pagamento);
	}

	@Override
	public void editar(Pagamento pagamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Pagamento buscar(Long id) {
		Optional<Pagamento> v = pagamentoRepository.findById(id);
		return v.get();
	}

	@Override @Transactional(readOnly = true)
	public List<Pagamento> listar() {
		return pagamentoRepository.findAll();
	}


}
