package com.alituran.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alituran.exception.BaseException;
import com.alituran.exception.ErrorMessage;
import com.alituran.exception.TypeMessage;
import com.alituran.model.Order;
import com.alituran.repository.OrderRepository;


@Service
public class OrderManager {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductManager productManager;
	
	
	
	public String stockInformation(Long id,int quantity) {
		Optional<Order> optional = orderRepository.findById(id);
		
		if(optional.isEmpty()) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_VALUE, id.toString()));
		}
		Order dbOrder = optional.get();
		
				
	if(dbOrder.getProduct().getProductStock()<=0 || dbOrder.getProduct().getProductStock()<quantity) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_STOCK, id.toString()));
		}
		
	productManager.buyProduct(dbOrder.getProduct().getId(), quantity);
	
		return "The transaction was successful"+"\n";
	}

}
