package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pelicula;

public interface IPeliculaService {
	
	//Metodos del CRUD
			public List<Pelicula> listarPeliculas(); //Listar All 
			
			public Pelicula guardarPelicula(Pelicula pelicula);	//Guarda un pelicula CREATE
			
			public Pelicula peliculaXID(int codigo); //Leer datos de un pelicula READ
			
			public Pelicula actualizarPelicula(Pelicula pelicula); //Actualiza datos del pelicula UPDATE
			
			public void eliminarPelicula(int codigo);// Elimina el pelicula DELETE

}
