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

import com.example.demo.dto.Departamento;

import com.example.demo.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoService;
	
	@GetMapping("/departamento")
	public List<Departamento> listarDepartamentos(){
		return departamentoService.listarDepartamentos();
	}

	@PostMapping("/departamento")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamento/{id}")
	public Departamento departamentoXID(@PathVariable(name="id")int id){
		Departamento departamento_xId = new Departamento();
		departamento_xId = departamentoService.departamentoXID(id);
		
		
		return departamento_xId;
	}
	
	@PutMapping("/departamento/{id}")
	public Departamento actualizarEmpleado(@PathVariable(name="id")String id,@RequestBody Departamento departamento) {
		
		Departamento departamentoSeleccionado = new Departamento();
		Departamento departamentoModificado = new Departamento();
		
		
		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());
		
		
		departamentoModificado = departamentoService.actualizarDepartamento(departamentoSeleccionado);
		
		return departamentoModificado;
		
	}
	
	@DeleteMapping("departamento({id}")
	public void eliminarDepartamento(@PathVariable(name="id") int id) {
		departamentoService.eliminarDepartamento(id);
	}

}
