package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductResource {

	@Autowired
	ProductRepository repository;
	
	@RequestMapping(method=RequestMethod.GET ,value="products") 
	public List<Product> getProducts() {
		return repository.getProducts();
	}
	
	@RequestMapping(method=RequestMethod.GET ,value="products/{productId}") 
	public Product getProduct(@PathVariable("productId") int id) {
		return repository.getProduct(id);
	}
	
}
