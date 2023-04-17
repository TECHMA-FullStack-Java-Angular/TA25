package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{
	
	//Utilizamos los metodos de la interface IArticuloDAO, es como si instaciaramos.
	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo nombre) {
		
		return iArticuloDAO.save(nombre);
	}

	@Override
	public Articulo articuloXID(int codigo) {
		
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo nombre) {
		
		return iArticuloDAO.save(nombre);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		iArticuloDAO.deleteById(codigo);
		
	}

}
