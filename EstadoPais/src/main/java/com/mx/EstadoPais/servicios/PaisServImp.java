package com.mx.EstadoPais.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.EstadoPais.dao.PaisDao;
import com.mx.EstadoPais.dominio.Pais;
@Service
public class PaisServImp implements PaisServ{

	@Autowired
	PaisDao paisDao;
	@Override
	public void guardar(Pais pais) {
		paisDao.save(pais);
		
	}

	@Override
	public void eliminar(Pais pais) {
		paisDao.delete(pais);
		
	}

	@Override
	public void editar(Pais pais) {
		paisDao.save(pais);
		
	}

	@Override
	public Pais buscar(Pais pais) {
		return paisDao.findById(pais.getId()).orElse(null);
	}

	@Override
	public List<Pais> listar() {
		return (List<Pais>) paisDao.findAll();
	}

}
