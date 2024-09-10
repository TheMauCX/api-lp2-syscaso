package com.example.syscaso.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="empleados")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="nombre", length = 100)
	private String nombre;
	@Column(name="apellidos", length = 100)
	private String apellidos;
	@Column(name="dni", length = 8)
	private String dni;
	@Column(name="correo", length = 100)
	private String correo;
	@Column(name="estado")
	private char estado;
	
	@OneToOne(mappedBy = "empleado", optional = true)
	@JsonIgnore
	private Usuario usuario;
}
