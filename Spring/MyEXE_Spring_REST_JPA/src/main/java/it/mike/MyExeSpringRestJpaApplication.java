package it.mike;

/* MyEXE_Spring_REST_JPA

1. Definire l'Entity Cliente 
1.1 Realizzare CLR per popolare la tabella con almeno 9 clienti
1.2 Realizzare la catena Controller/Service/Repository per gestire gli endpoint utili alle operazioni CRUD: 
inserimento, update, delete, select

2. Definire l'Entity Prodotto 
2.1 Realizzare CLR per popolare la tabella con almeno 9 prodotti
2.2 Realizzare la catena Controller/Service/Repository per gestire gli endpoint utili alle operazioni CRUD:
inserimento, update, delete, select

3. Definire l'Entity Ordine
Realizzare la catena Controller/Service/Repository per gestire gli endpoint utili alle operazioni CRUD: 
inserimento, update, delete, select

Creare la collezione Postman con tutte le request
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.mike.models.Cliente;
import it.mike.models.Prodotto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class MyExeSpringRestJpaApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(MyExeSpringRestJpaApplication.class, args);
		
	}
	
}
