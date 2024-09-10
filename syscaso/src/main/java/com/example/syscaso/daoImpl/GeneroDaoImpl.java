package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.GeneroDao;
import com.example.syscaso.entity.Genero;
import com.example.syscaso.repository.GeneroRepository;


@Component
public class GeneroDaoImpl implements GeneroDao{

	@Autowired
	private GeneroRepository repository;
	
	@Override
	public Genero create(Genero a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Genero update(Genero a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Genero> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
