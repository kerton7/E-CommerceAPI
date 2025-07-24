package com.alituran.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.alituran.model.CreditCard;
import com.alituran.model.Order;
import com.alituran.model.Product;
import com.alituran.model.User;
import com.alituran.repository.CreditCardRepository;
import com.alituran.repository.OrderRepository;
import com.alituran.repository.ProductRepository;
import com.alituran.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@Component
public class DatabaseSeeder {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	@PostConstruct
	public void addDatabase() {
		Product product1 = new Product
				(null, "IPhone 13", "Black", "Electronics", "Latest IPhone Model", 20, 0.5);
		
		Product product2 = new Product
				(null, "IPhone 16", "Pink", "Electronics", "Latest IPhone Model", 10, 0.5);
		
		Product product3 = new Product
				(null, "Samsung S24", "Blue", "Electronics", "Latest Samsung Model", 15, 1);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		
		  User user1 = new User
			 (null, "chat_moon", "Cagatay", "Karadag", "cagatay1234", LocalDate.of(2004, 7, 16),
				"cagataykaradag10@hotmail.com", "Bursa/Kemalpasa", "Manisa/Yunusemre",
				null, null, null);
		 			     
     User user2 = new User(null, "kayaalpomer", "Omer", "Kayaalp", "omer12347", LocalDate.of(2005, 5, 7),
		"omerkayaalp47@hotmail.com", "Mardin/Midyat", "Izmir/Konak", 
		null,null, null);	
		 userRepository.save(user1);
	       userRepository.save(user2);
	      
				            
 CreditCard creditCard1 = new CreditCard(null, "4500632878965456", "456", 
			LocalDate.of(2029, 8, 25), user1);
				    		
	creditCardRepository.save(creditCard1);
	
	Order order1 = new Order(null, user1, product2, creditCard1);
	
	orderRepository.save(order1);
	
		
	}
	
}
