package com.alituran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alituran.service.ProductManager;


@RestController
@RequestMapping(path = "/rest/api")
public class ProductController{

	@Autowired
	private ProductManager productManager;
	
	
	@GetMapping(path = "/buyproduct/{id}/productnumbers/{productNumbers}")
	public ResponseEntity<String> buyProduct(@PathVariable Long id, @PathVariable int productNumbers) {	
		return ResponseEntity.ok(productManager.buyProduct(id, productNumbers));
	}

}
