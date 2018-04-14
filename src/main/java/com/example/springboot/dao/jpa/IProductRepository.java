package com.example.springboot.dao.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Product;

@Repository
public interface IProductRepository  extends CrudRepository<Product, Long>{
	List<Product> findAll();
}

