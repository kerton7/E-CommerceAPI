package com.alituran.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alituran.exception.BaseException;
import com.alituran.exception.ErrorMessage;
import com.alituran.exception.TypeMessage;
import com.alituran.model.Product;
import com.alituran.repository.ProductRepository;


@Service
public class ProductManager {

	@Autowired
	private ProductRepository productRepository;
	
	
	
	public String buyProduct(Long id, int productNumbers) {
		Optional<Product> optional = productRepository.findById(id);
		
		if(optional.isEmpty()) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_VALUE, id.toString()));
		}
	
		Product dbProduct = optional.get();
		
		if(dbProduct.getProductStock()<productNumbers) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_STOCK, id.toString()));
		}
		dbProduct.setProductStock(dbProduct.getProductStock() - productNumbers);
		productRepository.save(dbProduct);
	return "The product was successfully purchased Remaining product amount:" 
		+ dbProduct.getProductStock()+"\n";
	}

}
