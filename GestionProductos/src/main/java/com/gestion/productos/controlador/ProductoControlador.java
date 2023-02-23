package com.gestion.productos.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gestion.productos.entidad.Productos;
import com.gestion.productos.servicio.ProductoServ;

@Controller
public class ProductoControlador {

	@Autowired
	private ProductoServ productoServ;
	
	//http://localhost:9000/productos
	@GetMapping("/productos") // lista los productos en la página de inicio
	public String listar(Model model) {
		model.addAttribute("productos", productoServ.listar());
		return "productos";
	}

	//
	@GetMapping("/productos/nuevo") // endpoint para formulario de creacion de productos
	public String formularioProductos(Model model) {
		Productos productos = new Productos();
		model.addAttribute("productos", productos);
		return "crear";
	}

	@PostMapping("/productos")
	public String guardarProducto(@ModelAttribute("productos") Productos productos) {
		productoServ.guardar(productos);
		return "redirect:/productos";
	}

	@GetMapping("/productos/editar/{id}")
	public String formularioEditar(@PathVariable int id, Model modelo) {
		modelo.addAttribute("productos", productoServ.buscarById(id));
		return "editar";
	}

	@PostMapping("/productos/{id}")
	public String actualizarProducto(@PathVariable int id, @ModelAttribute("productos") Productos productos,
			Model modelo) {
		Productos p = productoServ.buscarById(id);
		p.setId(id);
		p.setNombre(p.getNombre());
		p.setMarca(p.getMarca());
		p.setHechoEn(p.getHechoEn());
		p.setPrecio(p.getPrecio());

		productoServ.actualizar(p);
		return "redirect:/productos";
	}

	@GetMapping("/productos/{id}")
	public String eliminar(@PathVariable int id) {
		productoServ.eliminar(id);
		return "redirect:/productos";
	}
}
