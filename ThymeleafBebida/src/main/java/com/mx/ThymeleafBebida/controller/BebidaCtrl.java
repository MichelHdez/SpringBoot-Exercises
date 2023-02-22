package com.mx.ThymeleafBebida.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.ThymeleafBebida.dominio.Bebida;
import com.mx.ThymeleafBebida.servicios.BebidaServ;

@Controller
@RequestMapping("BebidaCtrl")
public class BebidaCtrl {
	@Autowired
	BebidaServ bebidaServ;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = bebidaServ.listar();
		System.out.println("lista-->" +lista);
		model.addAttribute("lista", lista);
		return "index";
	}
	
	@GetMapping("abrirGuardar")
	public String abrirGuardar(Bebida bebida) {
		return "agregar";
	}
	
	@PostMapping("guardar")
	public String guardar(Bebida bebida) {
		bebidaServ.guardar(bebida);
		return "redirect:/BebidaCtrl/inicio";
	}
	
	@GetMapping("/abrirEditar/{id}")
	public String abrirEditar(Bebida bebida, Model model) {
		bebida=bebidaServ.buscar(bebida);
		model.addAttribute("bebida", bebida);
		return "editar";
	}
	
	@PostMapping("editar")
	public String editar(Bebida bebida) {
		bebidaServ.editar(bebida);
		return "redirect:/BebidaCtrl/inicio";
	}
	
	@GetMapping("/abrirEliminar/{id}")
	public String abrirEliminar(Bebida bebida, Model model) {
		bebida=bebidaServ.buscar(bebida);
		model.addAttribute("bebida", bebida);
		return "eliminar";
	}
	
	@PostMapping("eliminar")
	public String eliminar(Bebida bebida) {
		bebidaServ.eliminar(bebida);
		return "redirect:/BebidaCtrl/inicio";
	}
}



