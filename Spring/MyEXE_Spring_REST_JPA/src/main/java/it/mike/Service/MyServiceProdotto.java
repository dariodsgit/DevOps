package it.mike.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mike.Repository.MyProdottoRepository;
import it.mike.models.Cliente;
import it.mike.models.Prodotto;

@Service
public class MyServiceProdotto {

	@Autowired
	MyProdottoRepository myProdottoRepository;

	// SELECT
	public List<Prodotto> myFindAllProdotti() {
		return myProdottoRepository.findAll();
	}
	// INSERT
	public void myInsertProdotto(Prodotto prodotto) {
		myProdottoRepository.save(prodotto);
	}
	// UPDATE
	public void myUpdateProdotto(Prodotto prodotto) {
		myProdottoRepository.myUpdateProdottoById(prodotto.getNome(), prodotto.getMarca(), prodotto.getPrezzo(),prodotto.getId_prodotto());
	}
	// DELETE
	public void deleteProdottoById(int id_user) {
		myProdottoRepository.deleteById(id_user);
	}
}
