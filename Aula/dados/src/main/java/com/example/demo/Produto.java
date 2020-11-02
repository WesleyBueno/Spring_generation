package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name ="Produtos" ) Serve para renomear a tabela  
public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	
	@Column
	private String nome;
}
