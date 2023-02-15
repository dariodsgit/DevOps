package it.mike.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import it.mike.models.Cliente;


public interface MyClienteRepository extends JpaRepository<Cliente, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE Cliente u SET u.nome = ?1, u.cognome = ?2, u.cartaDiCredito = ?3 where u.id = ?4")
	void myUpdateClienteById(String nome, String cognome,String cartaDiCredito, int id_user);

}
