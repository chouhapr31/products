package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.model.Product;

@Component
public class ProductRepository {

	private List<Product> products = new ArrayList<>();

	public ProductRepository() {
		products.add(new Product(1, "Headphone", 500, 1));
		products.add(new Product(2, "Bottle", 250, 2));
		products.add(new Product(3, "Laptop", 10000, 1));
	}

	public List<Product> getProducts() {
		return products;
	}

	public Product getProduct(int id) {
		return (Product) products.stream().filter(x -> x.getId() == id).findAny().get();
		/* return new User(); */
	}

	/*
	 * public static void main(String[] args) { UserRepository u = new
	 * UserRepository(); u.getUser(1); }
	 */
}
