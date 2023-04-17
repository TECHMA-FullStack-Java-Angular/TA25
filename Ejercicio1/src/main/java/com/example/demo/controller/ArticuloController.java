package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	public Articulo guardarArticulo(Articulo nombre) {
		return nombre;
		
	}

}
