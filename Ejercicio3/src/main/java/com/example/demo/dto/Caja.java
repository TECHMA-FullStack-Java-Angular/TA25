package com.example.demo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "cajas")
public class Caja {
	
	@Id
	private String referencia;
	private String contenido;
	private int valor;
	@ManyToOne
	@JoinColumn(name="almacen")
	private int almacen;
	
	//Contructores
	public Caja(String referencia, String contenido, int valor, int almacen) {
		
		this.referencia = referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	public Caja() {
		
	}
	
	//Gettrs & Setters

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getAlmacen() {
		return almacen;
	}

	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [referencia=" + referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen="
				+ almacen + "]";
	}
	
	

	
	
	
}
