package com.mx.CrudClientes.servicio;

import com.mx.CrudClientes.dominio.Empleados;

import java.util.List;

public interface EmpleadosService {
    public void guardar(Empleados empleado);
    public void editar(Empleados empleado);
    public void eliminar(Empleados empleado);
    public Empleados buscar(Empleados empleado);

    public List<Empleados> listar();
    Empleados buscarNombre(Empleados empleado);
    public List<Empleados> listarNombre(Empleados empleado);
}
