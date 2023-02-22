package com.bebidas.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bebidas.dao.BebidasDao;
import com.bebidas.entidad.Bebidas;

@Service
public class BebidasServImp implements BebidasServ {

	@Autowired
	BebidasDao bebidasDao;

	@Override
	public void guardar(Bebidas bebidas) {
		bebidasDao.save(bebidas);

	}

	@Override
	public void eliminar(Bebidas bebidas) {
		bebidasDao.delete(bebidas);

	}

	@Override
	public void editar(Bebidas bebidas) {
		bebidasDao.save(bebidas);

	}

	@Override
	public Bebidas buscar(Bebidas bebidas) {
		return bebidasDao.findById(bebidas.getId()).orElse(null);
	}

	@Override
	public List<Bebidas> listar() {
		return (List<Bebidas>) bebidasDao.findAll();
	}

}
