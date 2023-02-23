package com.gestiontareas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.gestiontareas.entidad.Tareas;

public interface TareasDao extends JpaRepository<Tareas, Integer>{
	
	//buscar por estado
	@Transactional(readOnly = true)
	//Query("select t from Tareas where t.estado like %?1%")
	List<Tareas> findByEstado(String estado);
}
