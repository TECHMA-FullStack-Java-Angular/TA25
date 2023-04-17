package com.example.demo.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="fabricantes")
public class Fabricante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	@OneToMany
	@JoinColumn(name="codigo_articulo")
	private List<Articulo> articulo;//un fabricante puede tener muchos articulos
	
	//Constructores
	
	public Fabricante(int codigo, String nombre, List<Articulo> articulo) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.articulo = articulo;
	}
	
	

	public Fabricante() {
		
	}



	//Getters & Setters

	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Articulo> getArticulo() {
		return articulo;
	}


	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}


	
	//To String
	@Override
	public String toString() {
		return "Fabricante [codigo=" + codigo + ", nombre=" + nombre + ", articulo=" + articulo + "]";
	}
	
	

}
