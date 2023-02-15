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
public class Prodotto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prodotto;	
	@Column(length = 25)
	private String nome;	
	@Column(length = 25)
	private String marca;	
	@Column(nullable = true)
	private double prezzo;
	
	@OneToMany(mappedBy="prodotto")
    List<Ordine> ordini;
	
	public Prodotto() {
	}
	public Prodotto(String nome, String marca, double prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.ordini = new ArrayList <Ordine>();
	}
	public int getId_prodotto() {
		return id_prodotto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + "]";
	}	
}