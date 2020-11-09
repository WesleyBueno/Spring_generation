package com.example.demo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.jogosTable;

public interface jogosRepository extends JpaRepository<jogosTable, Long> {
	
	


	

	Optional<jogosTable> findByNomeContainingIgnoreCase(String nome);

}
