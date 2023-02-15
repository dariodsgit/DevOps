package it.mike.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.mike.Repository.MyClienteRepository;
import it.mike.Repository.MyOrdineRepository;
import it.mike.Repository.MyProdottoRepository;
import it.mike.models.Cliente;

@Service
public class MyServiceCliente {

	@Autowired
	MyClienteRepository myClienteRepository;
	
	//SELECT
	public List<Cliente> myFindAllClienti() {
		return myClienteRepository.findAll();
	}	
	//INSERT
	public void myInsertCliente(Cliente cliente) {
		myClienteRepository.save(cliente);
	}
	//UPDATE
	public void myUpdateCliente(Cliente cliente) {
		myClienteRepository.myUpdateClienteById(cliente.getNome(), cliente.getCognome(), cliente.getCartaDiCredito(), cliente.getId_user());
	}
	//DELETE
	public void deleteById(int id_user) {
		myClienteRepository.deleteById(id_user);
	}
}
