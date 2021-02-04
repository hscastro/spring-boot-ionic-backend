package br.ce.hscastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.ce.hscastro.domain.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
