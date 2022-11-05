package com.example.Product.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Product.Enity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query(value="SELECT * FROM product.product where price>=:pr1 AND price<=:pr2",nativeQuery=true )
	
	public List <Product> getProductByPrice(@Param("pr1")int pr1,@Param("pr2")int pr2);
	
	@Query(value="SELECT product.product.id,product.product.name,product.product.price,product.product.hsn_code,product.gst.percentage,product.gst.hsn_code\r\n"
			+ "		FROM product.product\r\n"
			+ "		 INNER JOIN product.gst\r\n"
			+ "ON   product.gst.hsn_code=product.product.hsn_code;", nativeQuery=true)

	public List<Product> getalldetails();
}
	
	
	/*@Query(value="SELECT product.gst.percentage,product.gst.hsn_code, product.product.name,product.product.price,product.product.id,product.product.hsn_code\r\n"
			+ "		FROM product.product\r\n"
			+ "		 INNER JOIN product.gst\r\n"
			+ "ON   product.gst.hsn_code=product.product.hsn_code;", nativeQuery=true)
	}*/

