package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.jogosTable;
import com.example.demo.repository.jogosRepository;

@RestController
@RequestMapping("/")
public class jogosController {

	@Autowired
	private jogosRepository repository;
	
	//Mostra todos
	@GetMapping("/jogos")
	public List<jogosTable> buscarTodos(){
		return repository.findAll();
	}
	
	//Pega um por id
	@GetMapping("/jogos/{id}")
	public Optional<jogosTable> findById(@PathVariable Long id){ 
		return repository.findById(id);
	}
	
	//Retorna por genero
		@GetMapping("/jogos/busca/{nome}")		//Path Variable serve para pegar o parametro
		public Optional<jogosTable> findByNome(@PathVariable String nome){ 
			return repository.findByNomeContainingIgnoreCase(nome);
		}
		
		//Adiciona itens a tabela
		@PostMapping("/jogos")
		public jogosTable criar(@RequestBody jogosTable objetoJogo) {
			repository.save(objetoJogo);
			return objetoJogo;
		}
		
		//Altera itens da tabela
		@PutMapping("/jogos")
		public jogosTable atualizar (@PathVariable Long id,@RequestBody jogosTable model) {
			repository.save(model);
			return model;
		}
		
		@DeleteMapping("/jogos/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}
}
