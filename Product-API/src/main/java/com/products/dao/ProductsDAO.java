package com.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.entity.Product;

public interface ProductsDAO extends JpaRepository<Product, Long>{

}
