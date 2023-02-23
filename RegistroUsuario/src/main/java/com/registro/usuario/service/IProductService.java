package com.registro.usuario.service;

import java.util.List;

import com.registro.usuario.model.Product;

public interface IProductService {

	public void insert(Product product);
	public List<Product> listAll();
}
