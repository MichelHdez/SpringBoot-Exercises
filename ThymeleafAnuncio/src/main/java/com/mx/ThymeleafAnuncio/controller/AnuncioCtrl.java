package com.mx.ThymeleafAnuncio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.ThymeleafAnuncio.dominio.Anuncio;
import com.mx.ThymeleafAnuncio.servicios.AnuncioServ;

@Controller //que metodos necesitan devolver una lista 
@RequestMapping("AnuncioCtrl")
public class AnuncioCtrl {
	@Autowired
	AnuncioServ anuncioServ; //con esto llamamos a nuestros metodos de eliminar, buscar, etc
	
	@GetMapping("inicio")
	//@ResponseBody -> Para devolver un String, si no quitamos, en este caso,
	//buscará la vista index.
	public String index() {
		return "index"; 
		//return "index.html"; Devuelve lo mismo que el return "index";
	}
	
	@GetMapping("anuncio")
	public String listar(Model model) {
		var lista = anuncioServ.listar();
		System.out.println("lista-->" +lista);
		model.addAttribute("lista", lista); //pasamos el atributo del valor
		return "anuncio.html";
	}
	
	@GetMapping("abrirDescripcion")
	public String abrirDescripcion(Anuncio anuncio) {
		return "descripcion.html";
	}
	
	
	@GetMapping("abrirGuardar")
	public String abrirGuardar(Anuncio anuncio) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public  String guardar(Anuncio anuncio) {
		anuncioServ.guardar(anuncio);
		return "guardado.html";
	}
	
	@GetMapping("/abrirEditar/{id}")
	public String abrirEditar(Anuncio anuncio, Model model) {
		anuncio=anuncioServ.buscar(anuncio);
		model.addAttribute("anuncio", anuncio);
		return "editar";
	}
	
	@PostMapping("editar")
	public String editar(Anuncio anuncio) {
		anuncioServ.editar(anuncio);
		return "redirect:/AnuncioCtrl/anuncio";
	}
	
	@GetMapping("/abrirEliminar/{id}")
	public String abrirEliminar(Anuncio anuncio, Model model) { //
		anuncio=anuncioServ.buscar(anuncio);
		model.addAttribute("anuncio", anuncio);
		return "eliminar";
	}
	
	@PostMapping("eliminar")
	public String eliminar(Anuncio anuncio) {
		anuncioServ.eliminar(anuncio);
		return "redirect:/AnuncioCtrl/anuncio";
	}
	
}
