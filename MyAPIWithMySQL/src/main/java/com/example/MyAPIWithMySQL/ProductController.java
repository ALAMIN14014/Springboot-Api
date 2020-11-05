package com.example.MyAPIWithMySQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/products")
	public  List<Product>list(){
		
		
		return service.listAll();
		
	}

	@GetMapping("/products/{id}")
	
	public Product get(@PathVariable Integer id) {
		
		return service.get(id);
		
	}
	@PostMapping("/products")
	public void add(@RequestBody Product product) {
		service.save(product);
	
	}
	
	@PutMapping("/products/{id}")
	public void update(@RequestBody Product product, @PathVariable Integer id) {
		service.save(product);
	
	}	
	
	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
}
