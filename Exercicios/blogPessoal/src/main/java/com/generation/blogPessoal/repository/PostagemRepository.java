package com.generation.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.generation.blogPessoal.model.Postagem;


public interface PostagemRepository extends JpaRepository <Postagem,Long>{

		public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);

		 @Query(value = "select * from postagens where ano > 2011", nativeQuery = true)
		    List<Postagem> findAllMaior();
			
		    @Query(value = "SELECT * FROM postagens ORDER BY ano DESC ", nativeQuery = true)
		    List<Postagem> anosDesc();
		    
		    @Query(value = "SELECT * FROM postagens ORDER BY ano ", nativeQuery = true)
		    List<Postagem> anosAsc();
		    
		    
		    @Query(value = "SELECT * FROM postagens where ano >= 2011 and ano <= 2013", nativeQuery = true)
		    List<Postagem> anosIntervalos();

	
	
}
