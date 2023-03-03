package com.mx.CrudClientes.controller;

import com.mx.CrudClientes.dominio.Empleados;
import com.mx.CrudClientes.servicio.EmpleadosImplementacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("EmpleadosWebService")
@CrossOrigin
public class EmpleadosWebService {
    @Autowired
    EmpleadosImplementacionService empleadosImplementacionService;

    @GetMapping("listar")
    public List<Empleados> listar(){
        return empleadosImplementacionService.listar();
    }
    @GetMapping("listarNombre")
    public List<Empleados> listarNombre(@RequestBody Empleados empleado){
        return empleadosImplementacionService.listarNombre(empleado);
    }

    @PostMapping("guardar")
    public void guradar(@RequestBody Empleados empleado){
        empleadosImplementacionService.guardar(empleado);
    }

    @PostMapping("editar")
    public void editar(@RequestBody Empleados empleado){
        empleadosImplementacionService.editar(empleado);
    }

    @PostMapping("eliminar")
    public void eliminar(@RequestBody Empleados empleado){
        empleadosImplementacionService.eliminar(empleado);
    }

    @PostMapping("buscar")
    public Empleados buscar(@RequestBody Empleados empleado){
        return empleadosImplementacionService.buscar(empleado);
    }

    @PostMapping("buscarNombre")
    public List<Empleados> buscarNombre(@RequestBody Empleados empleado){
        return empleadosImplementacionService.listarNombre(empleado);
    }
}
