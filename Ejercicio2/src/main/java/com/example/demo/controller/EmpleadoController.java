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

import com.example.demo.dto.Empleado;
import com.example.demo.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl empleadoService;
	
	@GetMapping("/empleado")
	public List<Empleado> listarEmpleados(){
		return empleadoService.listarEmpleados();
	}

	@PostMapping("/empleado")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoService.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXID(@PathVariable(name="id")String dni){
		Empleado empleado_xId = new Empleado();
		empleado_xId = empleadoService.empleadoXID(dni);
		
		
		return empleado_xId;
	}
	
	@PutMapping("/empleado/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id")String id,@RequestBody Empleado empleado) {
		
		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoModificado = new Empleado();
		
		empleadoSeleccionado.setDni(empleado.getDni());
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellidos(empleado.getApellidos());
		empleadoSeleccionado.setDepartamento(empleado.getDepartamento());
		
		empleadoModificado = empleadoService.actualizarEmpleado(empleadoSeleccionado);
		
		return empleadoModificado;
		
	}
	
	@DeleteMapping("empleado({id}")
	public void eliminarEmpleado(@PathVariable(name="id") String dni) {
		empleadoService.eliminarEmpleado(dni);
	}
}
