package com.example.Product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.Enity.Product;
import com.example.Product.Service.ProductService;
import com.example.ProductNotFound.Exception.ProductNotFoundException;

@RestController
public class ProductRestController {
	@Autowired
	ProductService prodser;
	
	@GetMapping (value="/getbyid/{id}")
	public Product getById(@PathVariable int id) {
		return prodser.getById(id);
		
	}
	@GetMapping(value="/getAlldetails")
	public List<Product> getalldetails() {
		return prodser.getalldetails();

}
}
	
/*	@PostMapping(value="/add")
	
	public String adddetail(@RequestBody Product p) {
		return prodser.adddetail(p);
	}
		
		@PostMapping(value="/multi")
		
		public String multiDetail(@RequestBody List<Product> p) {
			return prodser.multidetail(p);
	}

	/*@GetMapping (value="/getPrice/{price1}/{price2}")	
	
	public List<Product> getByPrice(@PathVariable int price1, @PathVariable int price2) {
		return prodser.getByPrice(price1, price2);
	}
}*/
		
	/*	@GetMapping (value="/getprice/{price1}/{price2}")
		public List<Product> getByPrice(@PathVariable int price1,@PathVariable int price2) {
			return prodser.getByPrice(price1, price2);
		}
		
		@GetMapping(value="/getAll")
		public List<Product> getall() {
			return prodser.getall();*/







		
		
