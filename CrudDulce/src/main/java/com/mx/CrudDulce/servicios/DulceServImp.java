package com.mx.CrudDulce.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudDulce.dao.DulceDao;
import com.mx.CrudDulce.dominio.Dulce;

@Service
public class DulceServImp implements DulceServ {

	@Autowired
	private DulceDao dulceDao;

	@Transactional
	public void guardar(Dulce dulce) {
		dulceDao.save(dulce);
	}

	@Transactional
	public void editar(Dulce dulce) {
		dulceDao.save(dulce);

	}

	@Transactional
	public void eliminar(Dulce dulce) {
		dulceDao.delete(dulce);

	}

	@Transactional(readOnly=true)
	@Override
	public Dulce buscar(Dulce dulce) {
		return dulceDao.findById(dulce.getId()).orElse(null);
	}

	@Transactional(readOnly=true)
	public List<Dulce> listar() {
		return dulceDao.findAll();
	}

}
