package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.syscaso.dao.EmpleadoDao;
import com.example.syscaso.entity.Empleado;
import com.example.syscaso.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao dao;
	
	@Override
	public Empleado create(Empleado c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Empleado update(Empleado c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	

}
