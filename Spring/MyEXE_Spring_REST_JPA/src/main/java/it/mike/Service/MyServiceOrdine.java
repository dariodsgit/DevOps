package it.mike.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mike.Repository.MyOrdineRepository;
import it.mike.models.Cliente;
import it.mike.models.Ordine;

@Service
public class MyServiceOrdine {

	@Autowired
	MyOrdineRepository myOrdineRepository;

	// SELECT
	public List<Ordine> myFindAllOrdini() {
		return myOrdineRepository.findAll();
	}
	// INSERT
	public void myInsertOrdine(Ordine ordine) {
		myOrdineRepository.save(ordine);
	}
	// UPDATE
	public void myUpdateOrdine(Ordine ordine) {
		myOrdineRepository.myUpdateOrdineById(ordine.getCliente(), ordine.getProdotto(),ordine.getId_ordine());
	}
	// DELETE
	public void deleteById(int id_user) {
		myOrdineRepository.deleteById(id_user);
	}
}
