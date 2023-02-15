package it.mike.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import it.mike.models.Prodotto;


public interface MyProdottoRepository extends JpaRepository<Prodotto, Integer>{

	@Transactional
	@Modifying
	@Query("UPDATE Prodotto u SET u.nome = ?1, u.marca = ?2, u.prezzo = ?3 where u.id = ?4")
	void myUpdateProdottoById(String nome, String marca,double prezzo, int id_prodotto);
}
