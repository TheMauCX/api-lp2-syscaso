package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.RolDao;
import com.example.syscaso.entity.Rol;
import com.example.syscaso.entity.Usuario;
import com.example.syscaso.repository.RolRepository;
import com.example.syscaso.repository.UsuarioRepository;


@Component
public class RolDaoImpl implements RolDao{

	@Autowired
	private RolRepository repository;
	
	@Autowired
	private UsuarioRepository repository1;
	
	@Override
	public Rol create(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Rol update(Rol a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public Rol registrarRolUsuario(Long rolId, Long usuarioId) {
		// TODO Auto-generated method stub
		Rol rol = repository.findById(rolId).get();
		Usuario usu = repository1.findById(usuarioId).get();
		
		rol.getUsuarios().add(usu);
		usu.getRoles().add(rol);
		
		return repository.save(rol);
	}
}
