package com.example.Product.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Product.Enity.Product;
import com.example.Product.Repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository prodRepo;
	
	public String adddetail (Product p) {
		prodRepo.save(p);
		return "Saved Successfully";
	}
		
		public String multidetail (List <Product> p) {
			prodRepo.saveAll(p);
			return "Saved Successfully";
	}
	/*	public List<Product> getByPrice(int price1, int price2) {
			
			return prodRepo.getProductByPrice(price1, price2);*/

		public List<Product> getByPrice(int price1, int price2) {
			// TODO Auto-generated method stub
			return prodRepo.getProductByPrice(price1, price2);
		}

		public List<Product> getall() {
			
			 return prodRepo.findAll();
		}

		public List<Product> getalldetails() {
			
			return prodRepo.getalldetails();
		}
}

