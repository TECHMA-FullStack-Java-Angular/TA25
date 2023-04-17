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

import com.example.demo.dto.Caja;
import com.example.demo.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServiceImpl cajaService;
	
	@GetMapping("/caja")
	public List<Caja> listarCajas() {
		return cajaService.listarCajas();
	}
	
	@PostMapping("/caja")
	public Caja guardarCaja(@RequestBody Caja caja) {
		
		return cajaService.guardarCaja(caja);
	}
	
	@GetMapping("/caja/{id}")
	public Caja cajaXID(@PathVariable(name="id") String referencia) {
		
		Caja caja_xid= new Caja();
		
		caja_xid=cajaService.cajaXID(referencia);
		
		
		return caja_xid;
	}
	
	@PutMapping("/caja/{id}")
	public Caja actualizarAlmacen(@PathVariable(name="id")String referencia,@RequestBody Caja caja) {
		
		Caja caja_seleccionado= new Caja();
		Caja caja_actualizado= new Caja();
		
		caja_seleccionado= cajaService.cajaXID(referencia);
		
		
		caja_seleccionado.setReferencia(caja.getReferencia());
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaService.actualizarCaja(caja_seleccionado);
		
		
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/caja/{id}")
	public void eleiminarCaja(@PathVariable(name="id")String referencia) {
		cajaService.eliminarCaja(referencia);
	}

}
