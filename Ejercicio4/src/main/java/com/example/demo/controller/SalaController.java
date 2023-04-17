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

import com.example.demo.dto.Sala;
import com.example.demo.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaService;
	
	@GetMapping("/sala")
	public List<Sala> listarSalas() {
		return salaService.listarSalas();
		
	}


	@PostMapping("/sala")
	public Sala guardarSala(@RequestBody Sala sala) {
		
		return salaService.guardarSala(sala);
	}
	
	@GetMapping("/sala/{id}")
	public Sala salaXID(@PathVariable(name="id") int codigo) {
		
		Sala sala_xid= new Sala();
		
		sala_xid=salaService.salaXID(codigo);
			
		return sala_xid;
	}
	
	@PutMapping("/sala/{id}")
	public Sala actualizarSala(@PathVariable(name="id")int codigo,@RequestBody Sala sala) {
		
		Sala sala_seleccionado= new Sala();
		Sala sala_actualizado= new Sala();
		
		sala_seleccionado= salaService.salaXID(codigo);
		
		sala_seleccionado.setCodigo(sala.getCodigo());
		sala_seleccionado.setNombre(sala.getNombre());
		sala_seleccionado.setPelicula(sala.getPelicula());
		
		sala_actualizado = salaService.actualizarSala(sala_seleccionado);
	
		
		return sala_actualizado;
	}
	
	@DeleteMapping("/sala/{id}")
	public void eliminarSala(@PathVariable(name="id")int codigo) {
		salaService.eliminarSala(codigo);
	}
}
