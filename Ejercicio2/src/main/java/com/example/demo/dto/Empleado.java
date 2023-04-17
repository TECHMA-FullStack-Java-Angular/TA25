package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="empleados")
public class Empleado {
	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name="departamento_id")
	private Departamento departamento;
	
	

	//Constructores
	public Empleado(String dni, String nombre, String apellidos, Departamento departamento) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento;
	}

	public Empleado() {
		
	}
	
	//Getters & Setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	//ToString
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}
	
	

	
}
