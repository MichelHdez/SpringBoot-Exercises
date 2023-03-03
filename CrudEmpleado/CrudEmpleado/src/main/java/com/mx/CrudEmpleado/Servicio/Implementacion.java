package com.mx.CrudEmpleado.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudEmpleado.Dao.EmpleadoDao;
import com.mx.CrudEmpleado.Dominio.Empleado;

@Service
public class Implementacion implements Metodos {
	
	@Autowired
	EmpleadoDao empleadoDao;

	@Override
	public void guardar(Empleado empleado) {
		empleadoDao.save(empleado);
		
	}

	@Override
	public void editar(Empleado empleado) {
		empleadoDao.save(empleado);
		
	}

	@Override
	public void eliminar(Empleado empleado) {
		empleadoDao.delete(empleado);
		
	}

	@Override
	public Empleado buscar(Empleado empleado) {
		return empleadoDao.findById(empleado.getId()).orElse(null);
	}

	@Override
	public List<Empleado> listar() {
		return (List<Empleado>) empleadoDao.findAll();
	}

}
