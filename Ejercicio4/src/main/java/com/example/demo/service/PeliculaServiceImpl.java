package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPeliculaDao;
import com.example.demo.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{
	
	@Autowired
	IPeliculaDao iPelicula;

	@Override
	public List<Pelicula> listarPeliculas() {
		
		return iPelicula.findAll();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		
		return iPelicula.save(pelicula);
	}

	@Override
	public Pelicula peliculaXID(int codigo) {
		
		return iPelicula.findById(codigo).get();
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		
		return iPelicula.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int codigo) {
		iPelicula.deleteById(codigo);
		
	}

}
