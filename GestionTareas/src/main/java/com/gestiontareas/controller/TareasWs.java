package com.gestiontareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.gestiontareas.entidad.Tareas;
import com.gestiontareas.servicios.TareasServ;

@RestController
@RequestMapping("/")
@CrossOrigin
public class TareasWs {

	@Autowired
	TareasServ tareasServ;

	// http://localhost:9000/listar
	@GetMapping("listar")
	public List<Tareas> listar() {
		var lista = tareasServ.listar();
		return lista;
	}

	// http://localhost:9000/buscar
	@PostMapping("buscar")
	public Tareas buscar(@RequestBody Tareas tareas) {
		tareas = tareasServ.buscar(tareas);
		return tareas;
	}

	// http://localhost:9000/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Tareas tareas) {
		System.out.println("Tarea a guardar---> " + tareas);
		tareasServ.guardar(tareas);
	}

	// http://localhost:9000/editar
	@PostMapping("editar")
	public void editar(@RequestBody Tareas tareas) {
		tareasServ.editar(tareas);
	}

	// http://localhost:9000/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Tareas tareas) {
		tareasServ.eliminar(tareas);
	}

	// http://localhost:9000/estado
	/*@PostMapping("estado")
	public Tareas buscarPorEstado(@RequestBody Tareas tareas) {
		tareas = tareasServ.buscar(tareas);
		return tareas;
	}*/
	
	// http://localhost:9000/estado
	@PostMapping("estado")
	public List <Tareas> findByEstado(@RequestBody Tareas tareas) {
		var listaT = tareasServ.findByEstado(tareas);
		return listaT;
	}
}
