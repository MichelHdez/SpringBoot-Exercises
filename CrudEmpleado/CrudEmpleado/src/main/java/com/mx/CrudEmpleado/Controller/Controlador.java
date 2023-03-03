package com.mx.CrudEmpleado.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudEmpleado.Dominio.Departamento;
import com.mx.CrudEmpleado.Dominio.Empleado;
import com.mx.CrudEmpleado.Servicio.MetodoDepartamento;
import com.mx.CrudEmpleado.Servicio.Metodos;

@Controller
@RequestMapping("/")
public class Controlador {
	
	@Autowired
	Metodos metodos;
	
	@Autowired
	MetodoDepartamento metodoDepartamento;
	
	//http://localhost:7000/inicio
	@GetMapping("inicio")
	public String inicio (Model model) {
		var lista = metodos.listar();
		var listaD = metodoDepartamento.listar();
		model.addAttribute("lista",lista);
		model.addAttribute("listaD",listaD);
		return "main";
	}
	//GUARDAR EMPLEADO
	//http://localhost:7000/con/abrGuardar
	@GetMapping("abrGuardar")
	public String abrGuardar(Empleado empleado) {
		return "guardar";
	}
	@PostMapping("guardar")
	public String gaurdar(Empleado empleado) {
		metodos.guardar(empleado);
		return "redirect:/inicio";
	}
	//GUARDAR DEPARTAMENTO
	@GetMapping("abrGuardarD")
	public String abrGuardarD(Departamento departamento) {
		return "guardarD";
	}
	@PostMapping("guardarD")
	public String guardarD(Departamento departamento) {
		metodoDepartamento.guardar(departamento);
		return "redirect:/inicio";
	}
	
	//EDITAR EMPLEADO
	@GetMapping("abrEditar/{id}")
	public String abrEditar(Empleado empleado,Model model) {
		empleado = metodos.buscar(empleado);
		model.addAttribute("empleado",empleado);
		return "editar";
	}
	@PostMapping("editar")
	public String editar(Empleado empleado) {
		metodos.editar(empleado);
		return "redirect:/inicio";
	}
	
	//EDITAR DEPARTAMENTO
	@GetMapping("abrEditarD/{id}")
	public String abrEditarD(Departamento departamento,Model model) {
		departamento = metodoDepartamento.buscar(departamento);
		model.addAttribute("departamento",departamento);
		return "editarD";
	}
	@PostMapping("editarD")
	public String editarD(Departamento departamento) {
		metodoDepartamento.editar(departamento);
		return "redirect:/inicio";
	}
	
	//ELIMINAR EMPLEADO
	
	@GetMapping("abrEliminar/{id}")
	public String abrEliminar(Empleado empleado,Model model) {
		empleado = metodos.buscar(empleado);
		model.addAttribute("empleado",empleado);
		return "eliminar";
	}
	@PostMapping("eliminar")
	public String eliminar(Empleado empleado) {
		metodos.eliminar(empleado);
		return "redirect:/inicio";
	}
	
	//ELIMINAR DEPARTAMENTO
	
	@GetMapping("abrEliminarD/{id}")
	public String abrEliminarD(Departamento departamento,Model model) {
		departamento = metodoDepartamento.buscar(departamento);
		model.addAttribute("departamento",departamento);
		return "eliminarD";
	}
	@PostMapping("eliminarD")
	public String eliminarD(Departamento departamento) {
		metodoDepartamento.eliminar(departamento);
		return "redirect:/inicio";
	}
	
	
	

}
