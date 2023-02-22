package com.mx.CrudRopa.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudRopa.dao.RopaDao;
import com.mx.CrudRopa.dominio.Ropa;
@Service

public class RopaServImp implements RopaServ{

	@Autowired
	private RopaDao ropaDao;
	
	@Transactional
	
	public void guardar(Ropa ropa) {
		ropaDao.save(ropa);
		
	}

	@Transactional
	public void editar(Ropa ropa) {
		ropaDao.save(ropa);
		
	}

	@Transactional
	public void eliminar(Ropa ropa) {
		ropaDao.delete(ropa);
		
	}

	//para que no guarde el estado que se queda y tengamos mejor rendiemietno de consulta
	@Transactional(readOnly=true)
	public Ropa buscar(Ropa ropa) {
		return ropaDao.findById(ropa.getId()).orElse(null);
	}

	@Transactional(readOnly=true)
	public List<Ropa> listar() {
	
		return ropaDao.findAll();
	}

}
