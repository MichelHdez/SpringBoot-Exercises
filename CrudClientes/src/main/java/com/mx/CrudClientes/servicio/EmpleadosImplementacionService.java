package com.mx.CrudClientes.servicio;

import com.mx.CrudClientes.dao.EmpleadosDAO;
import com.mx.CrudClientes.dominio.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadosImplementacionService implements EmpleadosService {
    @Autowired
    EmpleadosDAO empleadosDAO=null;

    @Transactional
    @Override
    public void guardar(Empleados empleado) {
        empleadosDAO.save(empleado);
    }

    @Transactional
    @Override
    public void editar(Empleados empleado) {
        empleadosDAO.save(empleado);
    }

    @Transactional
    @Override
    public void eliminar(Empleados empleado) {
        empleadosDAO.delete(empleado);
    }


    @Transactional
    @Override
    public Empleados buscar(Empleados empleado) {
        empleado = empleadosDAO.findById(empleado.getId()).orElse(null);
        System.out.println(empleado);
        return empleado;
    }

    @Transactional
    @Override
    public List<Empleados> listar() {
        return empleadosDAO.findAll();
    }

    @Transactional
    @Override
    public Empleados buscarNombre(Empleados empleado) {
        List<Empleados> empleadosList = empleadosDAO.findByNombre(empleado.getNombre());
        for (Empleados trabajador : empleadosList){
            if(trabajador.getNombre().equals(empleado.getNombre()) && trabajador.getApp().equals(empleado.getApp())){
                empleado=trabajador;
            }
        }
        return empleado;
    }

    @Transactional
    @Override
    public List<Empleados> listarNombre( Empleados empleado) {
        return empleadosDAO.findByNombre(empleado.getNombre());
    }
}
