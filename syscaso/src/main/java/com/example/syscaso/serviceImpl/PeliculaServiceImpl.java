package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.PeliculaDao;
import com.example.syscaso.entity.Pelicula;
import com.example.syscaso.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService {

	@Autowired
	private PeliculaDao dao;
	
	@Override
	public Pelicula create(Pelicula c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Pelicula update(Pelicula c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	

}
