package com.alituran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alituran.model.Product;
import com.alituran.service.UserManager;


@RestController
@RequestMapping(path = "/rest/api")
public class UserController {

	@Autowired
	private UserManager userManager;
	
	
	@GetMapping(path = "/orderproduct/userid/{userId}/productid/{productId}/quantity/{quantity}")
	public ResponseEntity<String>  orderProduct
	(@PathVariable Long userId, @PathVariable Long productId,@PathVariable int quantity) {
		return ResponseEntity.ok(userManager.orderProduct(userId, productId,quantity));
		
	}

	@GetMapping(path = "/addfavorite/userid/{userId}/productid/{productId}")
	public ResponseEntity<String>  addFavorite(@PathVariable Long userId, @PathVariable Long productId) {
		return ResponseEntity.ok(userManager.addFavorite(userId, productId));
		
	}

}
