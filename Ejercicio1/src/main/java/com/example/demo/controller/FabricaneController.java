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


import com.example.demo.dto.Fabricante;

import com.example.demo.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricaneController {

	@Autowired
	FabricanteServiceImpl fabricanteService;
	
	@GetMapping("/fabricante")
	public List<Fabricante> listarFabricantes(){
		return fabricanteService.listarFabricantes();
	}
	
	@PostMapping("/fabricante")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteService.actualizarFabricante(fabricante);
		
	}

	@GetMapping("/fabricante/{id}")
	public Fabricante fabricanteXID(@PathVariable (name="id") int id) {
		Fabricante fabricanteXID = new Fabricante();
		fabricanteXID = fabricanteService.fabricanteXID(id);
		
		return fabricanteXID;
	}
	
	@PutMapping("/fabricante/{id}")
	public Fabricante actualizarFabricante(@PathVariable (name="id") int id, @RequestBody Fabricante fabricante) {
		Fabricante fabricanteSeleccionado = new Fabricante();
		Fabricante fabricanteModificado = new Fabricante();
		
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		fabricanteSeleccionado.setArticulo(fabricante.getArticulo());
		
		fabricanteModificado= fabricanteService.actualizarFabricante(fabricanteSeleccionado);
		
		fabricanteSeleccionado= fabricanteService.fabricanteXID(id);	
		
		return fabricanteModificado;
	}
	
	@DeleteMapping("/fabricante/{id}")
	public void eliminarFabricante(@PathVariable (name="id")int id) {
		fabricanteService.eliminarFabricante(id);
	}
}
