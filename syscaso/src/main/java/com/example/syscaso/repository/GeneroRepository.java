package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.syscaso.entity.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Long>{

}
