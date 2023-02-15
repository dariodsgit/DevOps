package it.mike.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import it.mike.models.Cliente;
import it.mike.models.Ordine;
import it.mike.models.Prodotto;


public interface MyOrdineRepository extends JpaRepository<Ordine, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE Ordine u SET u.cliente = ?1, u.prodotto = ?2 where u.id_ordine = ?3")
	void myUpdateOrdineById(Cliente cliente, Prodotto prodotto, int id);
}
