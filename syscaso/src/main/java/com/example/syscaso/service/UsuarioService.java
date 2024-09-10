package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Usuario;


public interface UsuarioService {
	Usuario create(Usuario c);
	Usuario update(Usuario c);
	void delete(Long id);
	Optional<Usuario> read(Long id);
	List<Usuario> readAll();
}
