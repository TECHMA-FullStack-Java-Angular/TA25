package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.Sala;

public interface ISalaService {

	//Metodos del CRUD
	public List<Sala> listarSalas(); //Listar All 
	
	public Sala guardarSala(Sala sala);	//Guarda un sala CREATE
	
	public Sala salaXID(int codigo); //Leer datos de un sala READ
	
	public Sala actualizarSala(Sala sala); //Actualiza datos del sala UPDATE
	
	public void eliminarSala(int codigo);// Elimina el sala DELETE
	
}
