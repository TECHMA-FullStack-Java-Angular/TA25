package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{
	
	@Autowired
	ICajaDAO iCaja;

	@Override
	public List<Caja> listarCajas() {
		
		return iCaja.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCaja.save(caja);
	}

	@Override
	public Caja cajaXID(String referencia) {
		
		return iCaja.findById(referencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCaja.save(caja);
	}

	@Override
	public void eliminarCaja(String referencia) {
		iCaja.deleteById(referencia);
		
	}

}
