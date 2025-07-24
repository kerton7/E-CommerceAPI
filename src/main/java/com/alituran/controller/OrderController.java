package com.alituran.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alituran.service.OrderManager;


@RestController
@RequestMapping(path = "/rest/api")
public class OrderController  {

	@Autowired
	private OrderManager orderManager;
	
	
	
	@GetMapping(path = "/stockinformation/{id}/quantity/{quantity}")
	public ResponseEntity<String> stockInformation(@PathVariable Long id,@PathVariable int quantity) {
		return ResponseEntity.ok(orderManager.stockInformation(id,quantity));
	}

}
