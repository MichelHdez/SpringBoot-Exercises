package com.mx.CRUDMarcaCelular.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CRUDMarcaCelular.dao.CelularDao;
import com.mx.CRUDMarcaCelular.dominio.Celular;
@Service
public class CelularServImp implements CelularServ{

	@Autowired
	CelularDao celularDao;
	public void guardar(Celular celular) {
		celularDao.save(celular);
		
	}

	@Override
	public void eliminar(Celular celular) {
		celularDao.delete(celular);
		
	}

	@Override
	public void editar(Celular celular) {
		celularDao.save(celular);
		
	}

	@Override
	public Celular buscar(Celular celular) {
		return celularDao.findById(celular.getId()).orElse(null);
	}

	@Override
	public List<Celular> listar() {
		return (List<Celular>) celularDao.findAll();
	}

}
