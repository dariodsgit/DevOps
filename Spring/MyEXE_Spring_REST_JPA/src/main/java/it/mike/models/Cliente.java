package it.mike.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;
	@Column(length = 25)
	private String nome;
	@Column(length = 25)
	private String cognome;
	@Column(length = 25)
	private String cartaDiCredito;
	@OneToMany(mappedBy = "cliente")
    List<Ordine> ordini;
	
	public Cliente() {
	}
	public Cliente(String nome, String cognome, String cartaDiCredito) {
		this.nome = nome;
		this.cognome = cognome;
		this.cartaDiCredito = cartaDiCredito;
		this.ordini = new ArrayList<Ordine>();
	}
	public int getId_user() {
		return id_user;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCartaDiCredito() {
		return cartaDiCredito;
	}
	public void setCartaDiCredito(String cartaDiCredito) {
		this.cartaDiCredito = cartaDiCredito;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", cartaDiCredito=" + cartaDiCredito + "]";
	}
}
