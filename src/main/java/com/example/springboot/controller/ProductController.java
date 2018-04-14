package com.example.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Product;
import com.example.springboot.service.ProductService;

@RestController
@RequestMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

	@Autowired
	public ProductService productService;

	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getProductList() {
		return productService.getProductList();

	}

	@RequestMapping(value = "/find/{id}/", method = RequestMethod.GET)
	@ResponseBody
	public Optional<Product> findById(@PathVariable Long id) {
		
		return productService.findById(id);

	}

	@RequestMapping(value = "/add/", method = RequestMethod.POST)
	@ResponseBody
	public Long addProduct(@RequestBody Product product) {
		return productService.addProduct(product);

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	@ResponseBody
	public void removeProduct(@PathVariable Long id) {
		productService.deleteProduct(id);

	}
}
