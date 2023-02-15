package it.mike.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import it.mike.models.Cliente;
import it.mike.models.Ordine;
import it.mike.models.Prodotto;

public class MyConfig {

	@Bean("newCliente")
	@Scope("prototype")
	public Cliente cliente(String cartaDiCredito, String nome, String cognome) {
		return new Cliente(cartaDiCredito, nome, cognome);
	}
	@Bean("newOrdine")
	@Scope("prototype")
	public Ordine ordine(Cliente cliente, Prodotto prodotto) {
		return new Ordine(cliente, prodotto);
	}
	@Bean("newProdotto")
	@Scope("prototype")
	public Prodotto prodotto(String nome, String marca, double prezzo){
		return new Prodotto(nome, marca, prezzo);
	}
}
