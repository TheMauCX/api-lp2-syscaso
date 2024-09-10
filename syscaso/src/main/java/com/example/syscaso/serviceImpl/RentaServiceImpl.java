package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.RentaDao;
import com.example.syscaso.entity.Renta;
import com.example.syscaso.service.RentaService;

@Service
public class RentaServiceImpl implements RentaService {

	@Autowired
	private RentaDao dao;
	
	@Override
	public Renta create(Renta c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Renta update(Renta c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
	

}
