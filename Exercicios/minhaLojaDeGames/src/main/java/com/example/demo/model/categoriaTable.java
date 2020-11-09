package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="tb_categoria")
public class categoriaTable {

		@Id
		@GeneratedValue(strategy =GenerationType.IDENTITY)
		private Long id;
		
		@Column
		private String console;
		
		@Column
		private String genero;
		
		@Column
		private int idade;
		

		@OneToMany(mappedBy="categoriaTable", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoriaTable")
		private List<jogosTable> jogosTable;


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getConsole() {
			return console;
		}

		public void setConsole(String console) {
			this.console = console;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
		
		
		
		
}
