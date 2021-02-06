package br.ce.hscastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ce.hscastro.domain.Categoria;
import br.ce.hscastro.repositories.CategoriaRepository;

@Service @Transactional(readOnly = false) 
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public void salvar(Categoria categoria) {		
		categoriaRepository.save(categoria);
	}

	@Override
	public void editar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Categoria buscar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override @Transactional(readOnly = true)
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
