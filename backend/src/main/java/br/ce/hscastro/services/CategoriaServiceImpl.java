package br.ce.hscastro.services;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import br.ce.hscastro.domain.Categoria;
import br.ce.hscastro.repositories.CategoriaRepository;


@Service @Transactional(readOnly = false) 
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public Categoria insert(Categoria obj) {
	    obj.setId(null);
	    return repository.save(obj);
	}	

	@Override
	public Categoria update(Categoria categoria) {
		find(categoria.getId());
	    return repository.save(categoria);		
	}

	@Override
	public void excluir(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override @Transactional(readOnly = true)
	public Categoria find(Long id) {
		Categoria obj = repository.getOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontro Id "+id
					+" Tipo: "+ Categoria.class.getName(), null);
		}
		return obj;
	}

	@Override @Transactional(readOnly = true)
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return null;
	}


}
