package com.mx.CrudClientes.servicio;

import com.mx.CrudClientes.dominio.Cotizacion;

import java.util.List;

public interface CotizacionService {
    public void guardar(Cotizacion cotizacion);
    public void editar(Cotizacion cotizacion);
    public void eliminar(Cotizacion cotizacion);
    public Cotizacion buscarID(Cotizacion cotizacion);
    public List<Cotizacion> buscarAtributo(Cotizacion cotizacion);
    public List<Cotizacion> listar();
}
