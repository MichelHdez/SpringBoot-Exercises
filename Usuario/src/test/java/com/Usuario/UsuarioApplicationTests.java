package com.Usuario;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Usuario.entidad.Usuario;
import com.Usuario.servicios.Implementacion;

@SpringBootTest
class UsuarioApplicationTests {

	@Autowired
	Implementacion imp;

	@Test
	public void testNombre() {
		System.out.println("Test Consultar Nombre");
		try {		
			String nombre = "Sara";
			
			assertNotNull (nombre, ()-> "Valor no puede ser nulo");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testListar() {
		System.out.println("Test Consulta Lista de Usuarios");
		try {
			List<Usuario> usuarios = imp.listar();
			assertTrue (usuarios.size() == 0);
			
			for (Usuario usuario : usuarios) {
				System.out.println("Lista Usuarios no viene vacia: " + usuario.getNombre());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	  @Test
	    public void dosValoresIguales() {
		  System.out.println("Test Consultar dos valores iguales");
		  String apellido ="Morales";
	      String apellidoU ="Morales";
	      Assertions.assertSame(apellido,apellidoU);
	    }
	  
	  @Test
	    public void dosValoresDiferentes(){
		  System.out.println("Test ds valores diferentes");
	        String correo ="correo@gmail.com";
	        String correoE ="correo@hotmail.com";
	        Assertions.assertNotSame(correo,correoE);
	    }
	  
	  }
