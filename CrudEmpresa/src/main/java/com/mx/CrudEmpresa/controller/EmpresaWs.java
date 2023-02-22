package com.mx.CrudEmpresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpresa.dominio.Empresa;
import com.mx.CrudEmpresa.servicios.EmpresaServ;

@RestController
@RequestMapping("EmpresaWs")
@CrossOrigin
public class EmpresaWs {

	@Autowired
	EmpresaServ empresaServ;
	
	//http://localhost:9000/EmpresaWs/listar
	@GetMapping("listar")
	public List<Empresa> listar(){
		var lista= empresaServ.listar();
		return lista;
	}
	
	@PostMapping("buscar")
	public Empresa buscar(@RequestBody Empresa empresa) {
		empresa=empresaServ.buscar(empresa);
		return empresa;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Empresa empresa) {
		System.out.println("Empresa a guardar..." + empresa);
		empresaServ.guardar(empresa);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Empresa empresa) {
		empresaServ.editar(empresa);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empresa empresa) {
		empresaServ.eliminar(empresa);
	}
	
	@PostMapping("buscarByPrecio")
	public List<Empresa> buscarByPrecio(@RequestBody Empresa empresa){
		var lista=empresaServ.buscarPrecio(empresa);
		return lista;
	}
	
	@PostMapping("buscarByTelefono")
	public List<Empresa> buscarByTelefono(@RequestBody Empresa empresa){
		var lista= empresaServ.buscarTelefono(empresa);
		return lista;
	}
}
