package it.mike.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mike.Service.MyServiceCliente;
import it.mike.Service.MyServiceProdotto;
import it.mike.models.Cliente;
import it.mike.models.Prodotto;

@RestController
@RequestMapping("/prodotto")
public class MyProdottoRestController {

	@Autowired
	private MyServiceProdotto myServiceProdotto;
		
	//SELECT
	@GetMapping("/mygetallprodotti")
	public List<Prodotto> myGetAllProdotti() {
		return myServiceProdotto.myFindAllProdotti();
	}
	//INSERT
	@PostMapping("/mypostinsertprodotto")
	public void myPostObj(@RequestBody Prodotto prodotto) {
		myServiceProdotto.myInsertProdotto(prodotto); 
	}
	//UPDATE
	@PostMapping("/mypostupdate")	
	public void myPostUpdate(@RequestBody Prodotto prodotto) {
		myServiceProdotto.myUpdateProdotto(prodotto);
	}
	//DELETE
	@GetMapping("deleteprodottobymyid/{id_user}")
	public void deleteProdottoObjById(@PathVariable int id_user) {
		myServiceProdotto.deleteProdottoById(id_user);		
		
	}
}
