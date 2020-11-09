package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.jogadorTable;

public interface jogadorRepository extends JpaRepository<jogadorTable, Long>{

}
