package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Fabricante;

public class FabricanteServiceImpl implements IFabricanteService{
	
	
	//Utilizamos los metodos de la interface IFabricanteDAO, es como si instaciaramos.
	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante fabricanteXID(int codigo) {
		
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int codigo) {
		iFabricanteDAO.deleteById(codigo);
		
	}

}
