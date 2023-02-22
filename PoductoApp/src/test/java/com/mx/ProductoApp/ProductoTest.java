package com.mx.ProductoApp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest//para identificar que vamos a realizar una prueba unitaria de una entidad
@AutoConfigureTestDatabase(replace=Replace.NONE)//hace referencia de operaciones a la BD REAL
@TestMethodOrder(OrderAnnotation.class)
public class ProductoTest {
	
	@Autowired
	private ProductoRepositorio repositorio;
	@Test//indicamos que es un método con el cual vamos a probar
	@Rollback(false)//aqui le indico false a Rollback para que no elimine la tabla
	@Order(1)
	public void testGuardarProducto() {
		Producto producto = new Producto("Television OLED LG",50000);
		Producto productoGuardado=repositorio.save(producto);
		assertNotNull(productoGuardado);
	}
	
	@Test
	@Order(2)
	public void testBuscarProductoPorNombre() {
		String nombre="Television OLED 4k S95B Samsung";
		Producto producto=repositorio.findByNombre(nombre);
		assertThat(producto.getNombre()).isEqualTo(nombre);
	}
	
	@Test
	@Order(3)
	public void testBuscarProductoPorNombreNoExistente() {
		String nombre="Iphone 11";
		Producto producto=repositorio.findByNombre(nombre);
		assertNull(producto);
	}
	
	@Test
	@Rollback(false)
	@Order(4)
	public void testActualizarProducto() {
		String nombreProducto="Television Samsung";
		Producto producto = new Producto(nombreProducto,2000);
		producto.setId(1);
		repositorio.save(producto);
		Producto productoActualizado=repositorio.findByNombre(nombreProducto);
		assertThat(productoActualizado.getNombre()).isEqualTo(nombreProducto);
	}
	
	@Test
	@Rollback(false)
	@Order(5)
	public void testListarProducto() {
		List<Producto> productos = (List<Producto>) repositorio.findAll();
		for (Producto producto : productos) {
			System.out.println(producto);
		}
		assertThat(productos).size().isGreaterThan(0);
		
	}
	
	@Test
	@Rollback(false)
	@Order(6)
	public void testEliminarProducto() {
		Integer id=6;
		boolean esExistenteAntesDeEliminar=repositorio.findById(id).isPresent();
		repositorio.deleteById(id);
		boolean noExisteDespuesDeEliminar=repositorio.findById(id).isPresent();
		assertTrue(esExistenteAntesDeEliminar);
		assertFalse(noExisteDespuesDeEliminar);
	}
}

