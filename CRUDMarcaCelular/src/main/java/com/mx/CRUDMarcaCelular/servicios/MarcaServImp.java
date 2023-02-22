package com.mx.CRUDMarcaCelular.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CRUDMarcaCelular.dao.MarcaDao;
import com.mx.CRUDMarcaCelular.dominio.Marca;
@Service
public class MarcaServImp implements MarcaServ{

	@Autowired
	MarcaDao marcaDao;
	public void guardar(Marca marca) {
		marcaDao.save(marca);
		
	}

	@Override
	public void eliminar(Marca marca) {
		marcaDao.delete(marca);
		
	}

	@Override
	public void editar(Marca marca) {
		marcaDao.save(marca);
		
	}

	@Override
	public Marca buscar(Marca marca) {
		return marcaDao.findById(marca.getId()).orElse(null);
	}

	@Override
	public List<Marca> listar() {
		return (List<Marca>) marcaDao.findAll();
	}

}
