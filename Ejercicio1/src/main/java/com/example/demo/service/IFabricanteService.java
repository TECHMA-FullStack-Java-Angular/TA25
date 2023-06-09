package com.example.demo.service;




import java.util.List;

import com.example.demo.dto.Fabricante;

public interface IFabricanteService {

	//Metodos del CRUD Fabricantes
	
		public List<Fabricante> listarFabricantes(); //Listar All 
		
		public Fabricante guardarFabricante(Fabricante fabricante);	//Guarda un fabricante CREATE
		
		public Fabricante fabricanteXID(int codigo); //Leer datos de un fabricante READ
		
		public Fabricante actualizarFabricante(Fabricante fabricante); //Actualiza datos del fabricante UPDATE
		
		public void eliminarFabricante(int codigo);// Elimina el fabricante DELETE
	
}
