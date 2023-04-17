package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulo;


public interface IArticuloService {

	
	//Metodos del CRUD Articulo
	
	        public List<Articulo> listarArticulos(); //Listar All  
			
			public Articulo guardarArticulo(Articulo nombre);	//Guarda un articulo CREATE
			
			public Articulo articuloXID(int codigo); //Leer datos de un articulo READ
			
			public Articulo actualizarArticulo(Articulo nombre); //Actualiza datos del articulo UPDATE
			
			public void eliminarArticulo(int codigo);// Elimina el articulo DELETE
}
