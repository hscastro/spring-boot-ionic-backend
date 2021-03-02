package br.ce.hscastro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ce.hscastro.domain.Produto;
import br.ce.hscastro.repositories.ProdutoRepository;

//classe de serviços

@Service @Transactional(readOnly = false) 
public class ProdutoServiceImpl implements ProdutoService {

	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public Produto salvar(Produto produto) {		
		return produtoRepository.save(produto);
	}

	@Override
	public void editar(Produto produto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Produto buscar(Long id) {
		Optional<Produto> v = produtoRepository.findById(id);
		return v.get();
	}

	@Override @Transactional(readOnly = true)
	public List<Produto> listar() {
		return produtoRepository.findAll();
	}


}
