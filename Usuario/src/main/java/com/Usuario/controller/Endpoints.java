package com.Usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Usuario.entidad.Usuario;
import com.Usuario.servicios.Implementacion;

@RestController //estereotipo que define la clase como un servicio Rest o web service de tipo Rest 
@RequestMapping("WebService") //se utiliza para asignar solicitudes web a los métodos 
@CrossOrigin("*") //es un concepto de seguridad que permiten o restringe los recursos implementados en los navegadores
public class Endpoints {

	@Autowired
	Implementacion imp;
	
		//	endpoint para obtener lista todos los usuarios
		// http://localhost:8080/WebService/usuarios
		@GetMapping(path = "usuarios")
		public List<Usuario> listar(){
			return imp.listar();
		}
		
		//	endpoint para la paginacion
		// http://localhost:8080/WebService/page
		@GetMapping(path = "page")
		public Page<Usuario> getAll(Pageable pageable){
			return imp.getAll(pageable);
		}

		//	endpoint para guardar un usuario
		// http://localhost:8080/WebService/guardar
		@RequestMapping(path = "guardar")
		public ResponseEntity<String> guardar(@RequestBody Usuario usuario) {
			imp.guardar(usuario);
			return new ResponseEntity<String>("Se guardó el usuario : " + usuario.getNombre(), HttpStatus.CREATED);
		}

		//	endpoint para editar usuario
		// http://localhost:8080/WebService/editar
		@RequestMapping(path = "editar")
		public ResponseEntity<String> editar(@RequestBody Usuario usuario) {
			imp.editar(usuario);
			return new ResponseEntity<String>("Se editó el usuario: " + usuario.getNombre(), HttpStatus.CREATED);
		}
		
		//	endpoint para elimina usuario
		// http://localhost:8080/WebService/eliminar
		@RequestMapping(path = "eliminar")
		public ResponseEntity<String> eliminar(@RequestBody Usuario usuario) {
			imp.eliminar(usuario);
			return new ResponseEntity<String>("Se ha eliminado usuario: ", HttpStatus.CREATED);
		}
	
}
