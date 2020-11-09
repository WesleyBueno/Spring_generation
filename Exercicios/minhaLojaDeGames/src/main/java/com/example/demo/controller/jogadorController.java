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

import com.example.demo.model.jogadorTable;

import com.example.demo.repository.jogadorRepository;


@RestController("/")
@RequestMapping
public class jogadorController {
	
	@Autowired
	private jogadorRepository repository;
	
	//Mostra todos
	@GetMapping("/jogador")
	public List<jogadorTable> buscarTodos(){
		return repository.findAll();
	}
	
	//Pega um por id
	@GetMapping("/jogador/{id}")
	public Optional<jogadorTable> buscarUm(@PathVariable Long id){ 
		return repository.findById(id);
	}
			
		//Adiciona itens a tabela
		@PostMapping("/jogador")
		public jogadorTable criar(@RequestBody jogadorTable objetoJogador) {
			repository.save(objetoJogador);
			return objetoJogador;
		}
		
		//Altera itens da tabela
		@PutMapping("/jogador")
		public jogadorTable atualizar (@PathVariable Long id,@RequestBody jogadorTable model) {
			repository.save(model);
			return model;
		}
		
		@DeleteMapping("/jogador/{id}")
		public void delete(@PathVariable long id) {
			repository.deleteById(id);
		}

}
