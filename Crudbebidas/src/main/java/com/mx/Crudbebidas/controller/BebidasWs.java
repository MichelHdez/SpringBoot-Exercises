package com.mx.Crudbebidas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Crudbebidas.entity.Bebidas;
import com.mx.Crudbebidas.service.BebidasImp;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class BebidasWs {

	@Autowired
	BebidasImp bebidaImp;

	// http://localhost:9000/listar
	@GetMapping("listar")
	public List<Bebidas> listar() {
		List<Bebidas> listaB = bebidaImp.listar();
		return listaB;
	}

	// http://localhost:9000/listarXatributo
	// listar por nombre
	@PostMapping("listarXatributo")
	public List<Bebidas> listarXatributo(@RequestBody Bebidas bebida) {

		var listaB = bebidaImp.listarXatributo(bebida);

		return listaB;
	}

	// guardar
	// http://localhost:9000/guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Bebidas bebida) {
		bebidaImp.guardar(bebida);

		return new ResponseEntity<String>("Se guardo la bebida", HttpStatus.OK);
	}

	// editar
	// http://localhost:9000/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Bebidas bebida) {
		bebidaImp.editar(bebida);

		return new ResponseEntity<String>("Se edito la bebida", HttpStatus.OK);
	}

	// eliminar
	// http://localhost:9000/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Bebidas bebida) {
		bebidaImp.eliminar(bebida);

		return new ResponseEntity<String>("Se elimino la bebida", HttpStatus.OK);
	}

	// buscar
	// http://localhost:9000/buscar
	@PostMapping("buscar")
	public Bebidas buscar(@RequestBody Bebidas bebida) {
		bebida = bebidaImp.buscar(bebida);

		return bebida;
	}

	// buscarXatributo
	// http://localhost:9000/buscar
	@PostMapping("buscarXatributo")
	public Bebidas buscarXatributo(@RequestBody Bebidas bebida) {
		bebida = bebidaImp.buscarXAtributo(bebida);

		return bebida;
	}
}
