package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Acceso;


public interface AccesoDao {
	Acceso create(Acceso c);
	Acceso update(Acceso c);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	Acceso registrarAccesoRol(Long accesoId, Long rolId);
}
