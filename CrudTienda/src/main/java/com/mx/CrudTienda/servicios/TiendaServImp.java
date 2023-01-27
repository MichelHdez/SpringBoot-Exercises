package com.mx.CrudTienda.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudTienda.dao.TiendaDao;
import com.mx.CrudTienda.dominio.Tienda;

@Service
public class TiendaServImp implements TiendaServ {

	@Autowired
	TiendaDao tiendaDao;

	public void guardar(Tienda tienda) {
		tiendaDao.save(tienda);

	}

	@Override
	public void editar(Tienda tienda) {
		tiendaDao.save(tienda);
	}

	@Override
	public void eliminar(Tienda tienda) {
		tiendaDao.delete(tienda);

	}

	@Override
	public Tienda buscar(Tienda tienda) {
		return tiendaDao.findById(tienda.getId()).orElse(null);
	}

	@Override
	public List<Tienda> listar() {
		return tiendaDao.findAll();
	}

	@Override
	public List<Tienda> buscarDireccion(Tienda tienda) {
		var lista = tiendaDao.findByDireccion(tienda.getDireccion());
		return lista;
	}

	@Override
	public List<Tienda> buscarTelefono(Tienda tienda) {
		var lista = tiendaDao.findByTelefono(tienda.getTelefono());
		return lista;
	}

}
