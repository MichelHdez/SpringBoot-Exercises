package com.mx.CrudClientes.controller;

import com.mx.CrudClientes.dominio.Cotizacion;
import com.mx.CrudClientes.servicio.CotizacionServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CotizacionWebService")
@CrossOrigin
public class CotizacionWebService {
    @Autowired
    CotizacionServiceImp cotizacionServiceImp;

    @GetMapping("listar")
    public List<Cotizacion> listar(){
        return cotizacionServiceImp.listar();
    }
    @PostMapping("guardar")
    public void guardar(@RequestBody Cotizacion cotizacion){
        System.out.println(cotizacion);
        cotizacionServiceImp.guardar(cotizacion);
    }
}
