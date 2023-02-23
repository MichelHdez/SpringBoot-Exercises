package com.registro.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuario.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long>{

}
