package it.mike.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mike.Service.MyServiceCliente;
import it.mike.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class MyClienteRestController {
	
	@Autowired
	private MyServiceCliente myServiceCliente;
		
	//SELECT
	@GetMapping("/mygetallclienti")
	public List<Cliente> myGetAllClienti() {
		return myServiceCliente.myFindAllClienti();
	}
	//INSERT
	@PostMapping("/mypostinsertcliente")
	public void myPostObj(@RequestBody Cliente cliente) {
		myServiceCliente.myInsertCliente(cliente); 
	}
	//UPDATE
	@PostMapping("/mypostupdate")	
	public void myPostUpdate(@RequestBody Cliente cliente) {
		myServiceCliente.myUpdateCliente(cliente);
	}
	//DELETE
	@DeleteMapping("deleteclientebymyid/{id_user}")
	public void deleteUserObjById(@PathVariable int id_user) {
		myServiceCliente.deleteById(id_user);		
		
	}
}
