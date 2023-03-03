package com.mx.CrudClientes.dao;

import com.mx.CrudClientes.dominio.Cotizacion;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CotizacionDAO extends CrudRepository<Cotizacion,Integer> {
    List<Cotizacion> findByNombreAndApp(String nombre, String app);
}
