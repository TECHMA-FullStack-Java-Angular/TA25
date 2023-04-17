package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Pelicula;
import com.example.demo.dto.Sala;
import com.example.demo.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaService;
	
	@GetMapping("/pelicula")
	public List<Pelicula> listarPeliculas() {
		return peliculaService.listarPeliculas();
		
	}


	@PostMapping("/pelicula")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculaService.guardarPelicula(pelicula);
	}
	
	@GetMapping("/pelicula/{id}")
	public Pelicula peliculaXID(@PathVariable(name="id") int codigo) {
		
		Pelicula pelicula_xid= new Pelicula();
		
		pelicula_xid=peliculaService.peliculaXID(codigo);
			
		return pelicula_xid;
	}
	
	@PutMapping("/pelicula/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")int codigo,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionado= new Pelicula();
		Pelicula pelicula_actualizado= new Pelicula();
		
		pelicula_seleccionado= peliculaService.peliculaXID(codigo);
		
		pelicula_seleccionado.setCodigo(pelicula.getCodigo());
		pelicula_seleccionado.setNombre(pelicula.getNombre());
		pelicula_seleccionado.setCalificacion(pelicula.getCalificacion());
		pelicula_seleccionado.setSalas(pelicula.getSalas());
		
		pelicula_actualizado = peliculaService.actualizarPelicula(pelicula_seleccionado);
	
		
		return pelicula_actualizado;
	}
	
	@DeleteMapping("/pelicula/{id}")
	public void eliminarSala(@PathVariable(name="id")int codigo) {
		peliculaService.eliminarPelicula(codigo);
	}

}
