package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISalaDao;
import com.example.demo.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
	
	@Autowired
	ISalaDao iSala;

	@Override
	public List<Sala> listarSalas() {
		
		return iSala.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		
		return iSala.save(sala);
	}

	@Override
	public Sala salaXID(int codigo) {
		
		return iSala.findById(codigo).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		
		return iSala.save(sala);
	}

	@Override
	public void eliminarSala(int codigo) {
		iSala.deleteById(codigo);
		
	}

}
