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

import com.example.syscaso.entity.Rol;
import com.example.syscaso.service.RolService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/roles")
public class RolController {
	@Autowired
	private RolService service;
	
	@GetMapping
	public ResponseEntity<List<Rol>> readAll(){
		try {
			List<Rol> Rols = service.readAll();
			if(Rols.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Rols, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Rol> crear(@Valid @RequestBody Rol cat){
		try {
			Rol c = service.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Rol> getRolId(@PathVariable("id") Long id){
		try {
			Rol c = service.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Rol> delRol(@PathVariable("id") Long id){
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateRol(@PathVariable("id") Long id, @Valid @RequestBody Rol cat){

			Optional<Rol> c = service.read(id);
			if(!c.isEmpty()) {
				return new ResponseEntity<>(service.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
	
	@PostMapping("/{rolId}/usuarios/{usuarioId}")
	public ResponseEntity<Rol> registroRolUsuario(@PathVariable Long rolId, @PathVariable Long usuarioId){
		 Rol rol = service.createRolUsuario(rolId, usuarioId);
		 return ResponseEntity.ok(rol);
		
	}
}
