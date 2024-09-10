package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.RolDao;

import com.example.syscaso.entity.Rol;

import com.example.syscaso.service.RolService;

import jakarta.transaction.Transactional;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	private RolDao dao;
	
	@Override
	public Rol create(Rol c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Rol update(Rol c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	
	@Override
	@Transactional
	public Rol createRolUsuario(Long rolId, Long usuarioId) {
		// TODO Auto-generated method stub
		return dao.registrarRolUsuario(rolId, usuarioId);
	}

}
