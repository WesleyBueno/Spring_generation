package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.categoriaTable;

public interface categoriaRepository extends JpaRepository<categoriaTable, Long> {

	Optional<categoriaTable> findByGenero(String genero);

	Optional<categoriaTable> findByGeneroContainingIgnoreCase(String genero);

}
