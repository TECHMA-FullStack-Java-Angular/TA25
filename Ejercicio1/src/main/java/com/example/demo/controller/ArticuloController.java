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

import com.example.demo.dto.Articulo;
import com.example.demo.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloService;
	
	@GetMapping("/articulo")
	public List<Articulo> listarArticulos(){
		return articuloService.listarArticulos();
	}
	
	@PostMapping("/articulo")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articuloService.guardarArticulo(articulo);
		
	}

	@GetMapping("/articulo/{id}")
	public Articulo fabricanteXID(@PathVariable (name="id") int id) {
		Articulo articuloXId = new Articulo();
		articuloXId = articuloService.articuloXID(id);
		
		return articuloXId;
	}
	
	@PutMapping("/articulo/{id}")
	Articulo actualizarArticulo(@PathVariable (name="id") int id, @RequestBody Articulo articulo) {
		Articulo articuloSeleccionado = new Articulo();
		Articulo articuloModificado = new Articulo();
		
		articuloSeleccionado.setFabricante(articulo.getFabricante());
		articuloSeleccionado.setNombre(articulo.getNombre());
		articuloSeleccionado.setPrecio(articulo.getPrecio());
		
		articuloModificado= articuloService.actualizarArticulo(articuloSeleccionado);
		
		articuloSeleccionado= articuloService.articuloXID(id);	
		
		return articuloModificado;
	}
	
	@DeleteMapping("/articulo/{id}")
	public void eliminarArticulo(@PathVariable (name="id")int id) {
		articuloService.eliminarArticulo(id);
	}
}
