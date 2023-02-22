package com.mx.EstadoPais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EstadoPais.dominio.Pais;
import com.mx.EstadoPais.servicios.PaisServ;

@RestController
@RequestMapping("PaisWs")
@CrossOrigin
public class PaisWs {

	@Autowired
	PaisServ paisServ;
	
	//http://localhost:9000/PaisWs/listar
	@GetMapping("listar")
	public List<Pais>listar(){
		var lista=paisServ.listar();
		return lista;
	}//listar
	
	//http://localhost:9000/PaisWs/buscar
	@PostMapping("buscar")
	public Pais buscar(@RequestBody Pais pais) {
		pais=paisServ.buscar(pais);
		return pais;
	}//buscar
	
	//http://localhost:9000/PaisWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Pais pais) {
		paisServ.guardar(pais);
	}//guardar
	
	//http://localhost:9000/PaisWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Pais pais) {
		paisServ.eliminar(pais);
	}//eliminar
	
	//http://localhost:9000/PaisWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Pais pais) {
		paisServ.editar(pais);
	}//editar
}
