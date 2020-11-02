package com.example.demo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//ponto no endereço do site
@RequestMapping("/hello")
@RestController
public class ServicoController {

	//MVC --- model(tabelas)
	//MVC --- view(Front-end)
	//MVC --- controller(cerebro, endereçamento de páginas)
	//JPA é a interface
	
	@GetMapping("/get1")
	public String hello1() {
		return "Hey Get1 Hello World";
		
	}
	
	@GetMapping("/get2")
	public String hello2() {
		return "Hey Get2 Hello World";
			
	}
	
	//injeção
			@Autowired
			private ServicoRepository repository;
	//get com find all
			@GetMapping ("/servicos")
			public List<ServicoModel> pegarTodos() {		
				return repository.findAll();
			}
			//Post é responsável por inserir
			@PostMapping("/servicos")
			public ServicoModel criar(@RequestBody ServicoModel tabelaServico) {
				repository.save(tabelaServico);
				return tabelaServico;
			}
}
