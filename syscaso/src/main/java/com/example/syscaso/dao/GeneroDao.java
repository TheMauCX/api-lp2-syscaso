package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Genero;


public interface GeneroDao {
	Genero create(Genero c);
	Genero update(Genero c);
	void delete(Long id);
	Optional<Genero> read(Long id);
	List<Genero> readAll();
}
