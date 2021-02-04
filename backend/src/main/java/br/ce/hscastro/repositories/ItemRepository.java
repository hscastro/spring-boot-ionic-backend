package br.ce.hscastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ce.hscastro.domain.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
