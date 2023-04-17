package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamento;


public interface IDepartamentoService {
	
	//Metodos del CRUD
			public List<Departamento> listarDepartamentos(); //Listar All 
			
			public Departamento guardarDepartamento(Departamento departamento);	//Guarda un departamento CREATE
			
			public Departamento empleadoXID(int id); //Leer datos de un departamento READ
			
			public Departamento actualizarDepartamento(Departamento cdepartamento); //Actualiza datos del departamento UPDATE
			
			public void eliminarDepartamento(int id);// Elimina el departamento DELETE

}
