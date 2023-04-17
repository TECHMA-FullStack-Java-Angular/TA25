package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Departamento;
import com.example.demo.service.IDepartamentoService;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
		IDepartamentoDAO iDepartamentoDAO;

	@Override
	public List<Departamento> listarDepartamentos() {
		
		return iDepartamentoDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public Departamento empleadoXID(int id) {
		
		return iDepartamentoDAO.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(int id) {
		iDepartamentoDAO.deleteById(id);
		
	}

}
