package com.mx.CRUDMarcaCelular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CRUDMarcaCelular.dominio.Marca;
import com.mx.CRUDMarcaCelular.servicios.MarcaServ;

@RestController
@RequestMapping("MarcaWs")
@CrossOrigin
public class MarcaWs {
	@Autowired
	MarcaServ marcaServ;
	
	//http://localhost:9000/MarcaWs/listar
	@GetMapping("listar")
	public List<Marca> listar(){
		var lista = marcaServ.listar();
		return lista;
	}//listar
	
	//http://localhost:9000/MarcaWs/buscar
	@PostMapping("buscar")
	public Marca buscar(@RequestBody Marca marca) {
		marca = marcaServ.buscar(marca);
		return marca;
	}//buscar
	
	//http://localhost:9000/MarcaWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Marca marca) {
		marcaServ.guardar(marca);
	}//guardar
	
	//http://localhost:9000/MarcaWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Marca marca) {
		marcaServ.eliminar(marca);
	}//eliminar
	
	//http://localhost:9000/MarcaWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Marca marca) {
		marcaServ.editar(marca);
	}//editar
}






