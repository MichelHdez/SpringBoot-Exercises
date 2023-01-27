package com.mx.ProyectoHospital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.ProyectoHospital.dominio.Hospital;

public interface HospitalDao extends JpaRepository<Hospital,Integer>{

}
