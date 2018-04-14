package com.example.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.dao.jpa.IProductRepository;
import com.example.springboot.model.Product;

@Service
public class ProductService {

	@Autowired
	IProductRepository productRepository;

	public List<Product> getProductList() {

		return productRepository.findAll();
	}

	public Long addProduct(Product product) {

		return productRepository.save(product).getId();
	}
	
	public Optional<Product> findById(Long id){
		return productRepository.findById(id);
	}
	
	public void deleteProduct(Long id){
		productRepository.deleteById(id);
		
	}
}
