package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.AccesoDao;
import com.example.syscaso.entity.Acceso;
import com.example.syscaso.entity.Rol;
import com.example.syscaso.repository.AccesoRepository;
import com.example.syscaso.repository.RolRepository;

@Component
public class AccesoDaoImpl implements AccesoDao{

	@Autowired
	private AccesoRepository repository;
	
	@Autowired
	private RolRepository repository1;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Acceso registrarAccesoRol(Long accesoId, Long rolId) {
		// TODO Auto-generated method stub
		Acceso ac = repository.findById(accesoId).get();
		Rol rol = repository1.findById(rolId).get();
		
		ac.getRoles().add(rol);
		rol.getAccesos().add(ac);
		
		return repository.save(ac);
	}

}
