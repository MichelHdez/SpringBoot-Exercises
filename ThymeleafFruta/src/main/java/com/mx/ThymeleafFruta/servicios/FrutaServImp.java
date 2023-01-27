package com.mx.ThymeleafFruta.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ThymeleafFruta.dao.FrutaDao;
import com.mx.ThymeleafFruta.dominio.Fruta;
@Service
public class FrutaServImp implements FrutaServ{

	@Autowired
	private FrutaDao frutaDao;
	
	public void guardar(Fruta fruta) {
		frutaDao.save(fruta);
		
	}

	@Override
	public void editar(Fruta fruta) {
		frutaDao.save(fruta);
		
	}

	@Override
	public void eliminar(Fruta fruta) {
		frutaDao.delete(fruta);
		
	}

	@Override
	public Fruta buscar(Fruta fruta) {
		return frutaDao.findById(fruta.getId()).orElse(null);
	}

	@Override
	public List<Fruta> listar() {
		return (List<Fruta>) frutaDao.findAll();
	}
	
}
