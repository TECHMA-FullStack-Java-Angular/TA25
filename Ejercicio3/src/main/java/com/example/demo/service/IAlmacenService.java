package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenService {

	//Metodos del CRUD
		public List<Almacen> listarAlmacens(); //Listar All 
		
		public Almacen guardarAlmacen(Almacen almacen);	//Guarda un almacen CREATE
		
		public Almacen almacenXID(int codigo); //Leer datos de un almacen READ
		
		public Almacen actualizarAlmacen(Almacen almacen); //Actualiza datos del almacen UPDATE
		
		public void eliminarAlmacen(int codigo);// Elimina el almacen DELETE
	
}
