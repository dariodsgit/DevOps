package it.mike.CLRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import it.mike.Repository.MyClienteRepository;
import it.mike.Repository.MyOrdineRepository;
import it.mike.Repository.MyProdottoRepository;
import it.mike.config.MyConfig;
import it.mike.models.Cliente;
import it.mike.models.Ordine;
import it.mike.models.Prodotto;



@Component
@Order(1)
public class CLRunner implements CommandLineRunner {
	
	@Autowired
	MyClienteRepository myClienteRepository;
	@Autowired
	MyOrdineRepository myOrdineRepository;
	@Autowired
	MyProdottoRepository myProdottoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------------------------------");
		System.out.println("Hello CommandLineRunner 1");
		AnnotationConfigApplicationContext myContext = new AnnotationConfigApplicationContext(MyConfig.class);
		/*
		Cliente c1 = (Cliente) myContext.getBean("newCliente","miche","kus","aaaaa111" );	
		Cliente c2 = (Cliente) myContext.getBean("newCliente","michela","kusto","aaaaa121" );
		Cliente c3 = (Cliente) myContext.getBean("newCliente","mario","suso","aaaaa131" );
		Cliente c4 = (Cliente) myContext.getBean("newCliente","sara","sukuso","aaaaa141" );
		Cliente c5 = (Cliente) myContext.getBean("newCliente","gian","pusto","aaaaa151" );
		Cliente c6 = (Cliente) myContext.getBean("newCliente","simona","ordine","aaaaa161" );
		Cliente c7 = (Cliente) myContext.getBean("newCliente","giulia","sedia","aaaaa171" );
		Cliente c8 = (Cliente) myContext.getBean("newCliente","anna","fuoco","aaaaa181" );
		Cliente c9 = (Cliente) myContext.getBean("newCliente","roberto","bianchi","aaaaa191" );
		
		Prodotto p1 = (Prodotto) myContext.getBean("newProdotto","acqua","sant'anna",2.00 );	
		Prodotto p2 = (Prodotto) myContext.getBean("newProdotto","iphone","Apple",2.00 );	
		Prodotto p3 = (Prodotto) myContext.getBean("newProdotto","pasta","barilla",2.00 );	
		Prodotto p4 = (Prodotto) myContext.getBean("newProdotto","pasta","jakarta",2.00 );	
		Prodotto p5 = (Prodotto) myContext.getBean("newProdotto","caffe","java",2.00 );	
		Prodotto p6 = (Prodotto) myContext.getBean("newProdotto","caffe","lavazza",2.00 );	
		Prodotto p7 = (Prodotto) myContext.getBean("newProdotto","latte","alpro",2.00 );	
		Prodotto p8 = (Prodotto) myContext.getBean("newProdotto","biscotti","mulino",2.00 );	
		Prodotto p9 = (Prodotto) myContext.getBean("newProdotto","acqua","egeria",2.00 );	
		
		
		myClienteRepository.save(c1);
		myClienteRepository.save(c2);
		myClienteRepository.save(c3);
		myClienteRepository.save(c4);
		myClienteRepository.save(c5);
		myClienteRepository.save(c6);
		myClienteRepository.save(c7);
		myClienteRepository.save(c8);
		myClienteRepository.save(c9);
		
		myProdottoRepository.save(p1);
		myProdottoRepository.save(p2);
		myProdottoRepository.save(p3);
		myProdottoRepository.save(p4);
		myProdottoRepository.save(p5);
		myProdottoRepository.save(p6);
		myProdottoRepository.save(p7);
		myProdottoRepository.save(p8);
		myProdottoRepository.save(p9);*/
	}
}