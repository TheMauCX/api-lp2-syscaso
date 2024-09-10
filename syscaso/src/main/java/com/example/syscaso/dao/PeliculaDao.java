package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Pelicula;


public interface PeliculaDao {
	Pelicula create(Pelicula c);
	Pelicula update(Pelicula c);
	void delete(Long id);
	Optional<Pelicula> read(Long id);
	List<Pelicula> readAll();
}
