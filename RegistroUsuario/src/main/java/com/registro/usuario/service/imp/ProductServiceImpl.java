package com.registro.usuario.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.registro.usuario.model.Product;
import com.registro.usuario.repository.IProductRepository;
import com.registro.usuario.service.IProductService;

public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public void insert(Product product) {
		productRepository.save(product);
		
	}

	@Override
	public List<Product> listAll() {
		return productRepository.findAll();
	}

}
