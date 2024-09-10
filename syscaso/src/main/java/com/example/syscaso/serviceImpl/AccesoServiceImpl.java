package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.AccesoDao;
import com.example.syscaso.entity.Acceso;
import com.example.syscaso.service.AccesoService;

import jakarta.transaction.Transactional;

@Service
public class AccesoServiceImpl implements AccesoService {

	@Autowired
	private AccesoDao dao;
	
	@Override
	public Acceso create(Acceso c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Acceso update(Acceso c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
	@Override
	@Transactional
	public Acceso createAccesoRol(Long accesoId, Long rolId) {
		// TODO Auto-generated method stub
		return dao.registrarAccesoRol(accesoId, rolId);
	}
	

}
