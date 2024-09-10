package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Renta;


public interface RentaDao {
	Renta create(Renta c);
	Renta update(Renta c);
	void delete(Long id);
	Optional<Renta> read(Long id);
	List<Renta> readAll();
}
