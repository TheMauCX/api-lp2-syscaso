package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.GeneroDao;
import com.example.syscaso.entity.Genero;
import com.example.syscaso.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService {

	@Autowired
	private GeneroDao dao;
	
	@Override
	public Genero create(Genero c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Genero update(Genero c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Genero> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	

}
