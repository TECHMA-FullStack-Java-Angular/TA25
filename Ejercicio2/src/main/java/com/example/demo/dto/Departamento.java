package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento {
	
	@Column(name="codigo")
	@Id
	private int id;
	private String nombre;
	private int presupuesto;

	@OneToMany
    @JoinColumn(name="departamento")
    private List<Empleado> empleado;
	
	

	//Contructores
	public Departamento(int id, String nombre, int presupuesto, List<Empleado> empleado) {
	
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.empleado = empleado;
	}

	public Departamento() {
		
	}
	
	//Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}

	//ToString
	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleado="
				+ empleado + "]";
	}
	
	
	
	
	
}
