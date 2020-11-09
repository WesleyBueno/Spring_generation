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


import com.example.demo.model.categoriaTable;
import com.example.demo.repository.categoriaRepository;

@RestController
@RequestMapping("/")
public class categoriaController {

	@Autowired
	private categoriaRepository repository;
	
	//Retorna todos
	@GetMapping("/categoria")
	public List<categoriaTable> buscarTodos(){
		return repository.findAll();
	}
	
	//Retorna por id
	@GetMapping("/categoria/{id}")		//Path Variable serve para pegar o parametro
	public Optional<categoriaTable> buscarUm(@PathVariable Long id){ 
		return repository.findById(id);
	}
	//Retorna por genero
	@GetMapping("/categoria/busca/{genero}")		//Path Variable serve para pegar o parametro
	public Optional<categoriaTable> buscarUm(@PathVariable String genero){ 
		return repository.findByGeneroContainingIgnoreCase(genero);
	}
	
	//Adiciona itens a tabela
	@PostMapping("/categoria")
	public categoriaTable criar(@RequestBody categoriaTable objetoCategoria) {
		repository.save(objetoCategoria);
		return objetoCategoria;
	}
	
	//Altera itens da tabela
	@PutMapping("/categoria")
	public categoriaTable atualizar (@PathVariable Long id,@RequestBody categoriaTable model) {
		repository.save(model);
		return model;
	}
	
	@DeleteMapping("/categoria/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
