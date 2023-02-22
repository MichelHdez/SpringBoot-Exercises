package com.televisores.controller;

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

import com.televisores.entity.Televisores;
import com.televisores.service.TelevisoresServ;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class TelevisoresWs {

	@Autowired
	TelevisoresServ televisorServ;
	
	// http://localhost:9000/listar
		@GetMapping("listar")
		public List<Televisores> listar() {
			List<Televisores> listaT = televisorServ.listar();
			return listaT;
		}

		// http://localhost:9000/listarXatributo
		// listar
		@PostMapping("listarXatributo")
		public List<Televisores> listarXatributo(@RequestBody Televisores televisor) {

			var listaT = televisorServ.listarXatributo(televisor);

			return listaT;
		}

		// guardar
		// http://localhost:9000/guardar
		@PostMapping("guardar")
		public ResponseEntity<String> guardar(@RequestBody Televisores televisor) {
			televisorServ.guardar(televisor);

			return new ResponseEntity<String>("Se guardo el televisor", HttpStatus.OK);
		}

		// editar
		// http://localhost:9000/editar
		@PostMapping("editar")
		public ResponseEntity<String> editar(@RequestBody Televisores televisor) {
			televisorServ.editar(televisor);

			return new ResponseEntity<String>("Se edito el televisor", HttpStatus.OK);
		}

		// eliminar
		// http://localhost:9000/eliminar
		@PostMapping("eliminar")
		public ResponseEntity<String> eliminar(@RequestBody Televisores televisor) {
			televisorServ.eliminar(televisor);

			return new ResponseEntity<String>("Se elimino el televisor", HttpStatus.OK);
		}

		// buscar
		// http://localhost:9000/buscar
		@PostMapping("buscar")
		public Televisores buscar(@RequestBody Televisores televisor) {
			televisor = televisorServ.buscar(televisor);

			return televisor;
		}

		// buscarXatributo
		// http://localhost:9000/buscarXatributo
		@PostMapping("buscarXatributo")
		public Televisores buscarXatributo(@RequestBody Televisores televisor) {
			televisor = televisorServ.buscarXAtributo(televisor);

			return televisor;
		}
}
