package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	@Autowired
	IAlmacenDAO iAlmacen;

	@Override
	public List<Almacen> listarAlmacens() {
		
		return iAlmacen.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacen.save(almacen);
	}

	@Override
	public Almacen almacenXID(int codigo) {
		
		return iAlmacen.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacen.save(almacen);
	}

	@Override
	public void eliminarAlmacen(int codigo) {
		iAlmacen.deleteById(codigo);
		
	}

}
