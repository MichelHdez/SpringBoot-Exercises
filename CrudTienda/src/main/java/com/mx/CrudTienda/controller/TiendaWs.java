package com.mx.CrudTienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudTienda.dominio.Tienda;
import com.mx.CrudTienda.servicios.TiendaServ;

@RestController
@RequestMapping("TiendaWs")
@CrossOrigin
public class TiendaWs {

	@Autowired
	TiendaServ tiendaServ;

	//http://localhost:9000/TiendaWs/listar
	@GetMapping("listar")
	public List<Tienda> listar() {
		var lista = tiendaServ.listar();
		return lista;
	}

	//http://localhost:9000/TiendaWs/buscar
	@PostMapping("buscar")
	public Tienda buscar(@RequestBody Tienda tienda) {
		tienda = tiendaServ.buscar(tienda);
		return tienda;
	}

	//http://localhost:9000/TiendaWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Tienda tienda) {
		System.out.println("Tienda a guardar... " + tienda);
		tiendaServ.guardar(tienda);
	}

	//http://localhost:9000/TiendaWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Tienda tienda) {
		tiendaServ.editar(tienda);
	}

	//http://localhost:9000/TiendaWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Tienda tienda) {
		tiendaServ.eliminar(tienda);
	}

	@PostMapping("buscarByDireccion")
	public List<Tienda> buscarByDireccion(@RequestBody Tienda tienda) {
		var lista = tiendaServ.buscarDireccion(tienda);
		return lista;
	}

	@PostMapping("buscarByTelefono")
	public List<Tienda> buscarByTelefono(@RequestBody Tienda tienda) {
		var lista = tiendaServ.buscarTelefono(tienda);
		return lista;
	}

}
