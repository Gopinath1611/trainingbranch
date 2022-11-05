package com.example.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.Product.Dao.ProductDao;
import com.example.Product.Enity.Product;
import com.example.Product.Repository.ProductRepository;
import com.example.ProductNotFound.Exception.ProductNotFoundException;
@Repository
@Service
public class ProductService {
	
	@Autowired
	
	ProductDao prodDao;
	
	@Autowired
	ProductRepository proRepo;
	public Product getById(int id) throws ProductNotFoundException {
		return proRepo.findById(id).orElseThrow(()->new ProductNotFoundException());
}
	public List<Product> getalldetails() {
		
		return prodDao.getalldetails() ;
	}
}
	
	/*public String adddetail(Product p) {
		
		return prodDao.adddetail(p);
	}
	
	public String multidetail (List<Product> p) {
		return prodDao.multidetail(p);


}

	public List<Product> getByPrice(int price1, int price2) {
		// TODO Auto-generated method stub
		return prodDao.getByPrice(price1, price2);
	}

	public List<Product> getall() {
		return prodDao.getall(); 
	}
	
	
/*public List<Product> getByPrice(int price1, int price2) {
		
		return prodDao.getByPrice(price1, price2);*/

