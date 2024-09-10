package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Rol;


public interface RolDao {
	Rol create(Rol c);
	Rol update(Rol c);
	void delete(Long id);
	Optional<Rol> read(Long id);
	List<Rol> readAll();
	Rol registrarRolUsuario(Long rolId, Long usuarioId);
}
