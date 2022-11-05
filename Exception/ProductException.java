package com.example.Product.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.ProductNotFound.Exception.ProductNotFoundException;


@ControllerAdvice
public class ProductException {
@ExceptionHandler(value=ProductNotFoundException.class)
	
	public ResponseEntity <Object> Exe() {
		return new ResponseEntity<>("No product is there",HttpStatus.NOT_FOUND);
	}

}



