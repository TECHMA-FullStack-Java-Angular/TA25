package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.Caja;

public interface ICajaService {
	
	//Metodos del CRUD
	public List<Caja> listarCajas(); //Listar All 
	
	public Caja guardarCaja(Caja caja);	//Guarda un caja CREATE
	
	public Caja cajaXID(String referencia); //Leer datos de un caja READ
	
	public Caja actualizarCaja(Caja caja); //Actualiza datos de la caja UPDATE
	
	public void eliminarCaja(String referencia);// Elimina la caja DELETE

}
