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

import com.example.demo.dto.Almacen;
import com.example.demo.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenService;
	

	@GetMapping("/almacen")
	public List<Almacen> listarAlmacens() {
		return almacenService.listarAlmacens();
	}
	
	@PostMapping("/almacen")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		
		return almacenService.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacen/{id}")
	public Almacen almacenXID(@PathVariable(name="id") int codigo) {
		
		Almacen almacen_xid= new Almacen();
		
		almacen_xid=almacenService.almacenXID(codigo);
		
		
		return almacen_xid;
	}
	
	@PutMapping("/almacen/{id}")
	public Almacen actualizarAlmacen(@PathVariable(name="id")int codigo,@RequestBody Almacen almacen) {
		
		Almacen almacen_seleccionado= new Almacen();
		Almacen almacen_actualizado= new Almacen();
		
		almacen_seleccionado= almacenService.almacenXID(codigo);
		
		almacen_seleccionado.setCodigo(almacen.getCodigo());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCajas(almacen.getCajas());
		
		almacen_actualizado = almacenService.actualizarAlmacen(almacen_seleccionado);
		
		
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacen/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")int codigo) {
		almacenService.eliminarAlmacen(codigo);
	}

}
