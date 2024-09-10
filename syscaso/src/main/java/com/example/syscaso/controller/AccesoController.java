package com.example.syscaso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.syscaso.entity.Acceso;
import com.example.syscaso.service.AccesoService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/accesos")
public class AccesoController {
	@Autowired
	private AccesoService service;
	
	@GetMapping
	public ResponseEntity<List<Acceso>> readAll(){
		try {
			List<Acceso> Accesos = service.readAll();
			if(Accesos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Accesos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Acceso> crear(@Valid @RequestBody Acceso cat){
		try {
			Acceso c = service.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Acceso> getAccesoId(@PathVariable("id") Long id){
		try {
			Acceso c = service.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Acceso> delAcceso(@PathVariable("id") Long id){
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAcceso(@PathVariable("id") Long id, @Valid @RequestBody Acceso cat){

			Optional<Acceso> c = service.read(id);
			if(!c.isEmpty()) {
				return new ResponseEntity<>(service.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
	
	@PostMapping("/{accesoId}/roles/{rolId}")
	public ResponseEntity<Acceso> registroAccesoRol(@PathVariable Long accesoId, @PathVariable Long rolId){
		 Acceso ac = service.createAccesoRol(accesoId, rolId);
		 return ResponseEntity.ok(ac);
		
	}
}
