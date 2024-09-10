package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Acceso;


public interface AccesoService {
	Acceso create(Acceso c);
	Acceso update(Acceso c);
	void delete(Long id);
	Optional<Acceso> read(Long id);
	List<Acceso> readAll();
	Acceso createAccesoRol(Long accesoId, Long rolId);
}
