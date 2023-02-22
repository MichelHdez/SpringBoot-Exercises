package com.mx.CrudDulce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudDulce.dominio.Dulce;
import com.mx.CrudDulce.servicios.DulceServ;

@RestController
@RequestMapping("DulceWs")
@CrossOrigin
public class DulceWs {

	@Autowired
	DulceServ dulceServ;

	//http://localhost:9000/DulceWs/listar
	@GetMapping("listar")
	public List<Dulce> listar() {
		return dulceServ.listar();
	}// listar

	//http://localhost:9000/DulceWs/buscar
	@PostMapping("buscar")
	public Dulce buscar(@RequestBody Dulce dulce) {

		return dulceServ.buscar(dulce);
	}// buscar

	//http://localhost:9000/DulceWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Dulce dulce) {
		dulceServ.guardar(dulce);
	}// guardar

	//http://localhost:9000/DulceWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Dulce dulce) {
		dulceServ.editar(dulce);
	}// editar

	//http://localhost:9000/DulceWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Dulce dulce) {
		dulceServ.eliminar(dulce);
	}

}
