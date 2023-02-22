package com.mx.CrudRopa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudRopa.dominio.Ropa;
import com.mx.CrudRopa.servicios.RopaServImp;

@RestController
@RequestMapping("RopaWs")
@CrossOrigin
public class RopaWs {
	
	@Autowired
	RopaServImp ropaServ;
	
	//http://localhost:9000/RopaWs/listar
	@GetMapping("listar")
	public List<Ropa> listar(){
		return ropaServ.listar();
	}//listar
	
	//http:localhost:9000/RopaWs/buscar
	@PostMapping("buscar")
	public Ropa buscar(@RequestBody Ropa ropa) {
		
		System.out.println("Pieza de ropa a guardar: " + ropa);
		return ropaServ.buscar(ropa);
	}//buscar
	
	//http:localhost:9000/RopaWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Ropa ropa ) {
		ropaServ.guardar(ropa);
	}
	
	//http:localhost:9000/RopaWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Ropa ropa) {
		ropaServ.editar(ropa);
	}//editar
	
	//http:localhost:9000/RopaWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Ropa ropa) {
		ropaServ.eliminar(ropa);
	}//eliminar
	
}
