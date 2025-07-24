package com.alituran.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alituran.exception.BaseException;
import com.alituran.exception.ErrorMessage;
import com.alituran.exception.TypeMessage;
import com.alituran.model.Product;
import com.alituran.model.User;
import com.alituran.repository.ProductRepository;
import com.alituran.repository.UserRepository;


@Service
public class UserManager  {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
  public String orderProduct(Long userId,Long productId,int quantity) {	
		
		Optional<User> optional = userRepository.findById(userId);
		
		Optional<Product> productopOptional = productRepository.findById(productId);
		if(optional.isEmpty()) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_VALUE, userId.toString()));
		}
		
		if(productopOptional.isEmpty()) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_VALUE, productId.toString()));
		}
		User dbUser = optional.get();
		Product product = productopOptional.get();
		
		if(product.getProductStock()<quantity) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_STOCK, productId.toString()));
		}
		
		dbUser.getOrderedProduct().add(product);
		userRepository.save(dbUser);
		return "Product successfully added to orders:"+ product.getProductName()+"\n";
		
	}
  
    public String addFavorite(Long userId, Long productId) {
		Optional<User> optional = userRepository.findById(userId);
		
		Optional<Product> productopOptional = productRepository.findById(productId);
		if(optional.isEmpty()) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_VALUE, userId.toString()));
		}
		if(productopOptional.isEmpty()) {
			throw new BaseException(new TypeMessage(ErrorMessage.NO_VALUE, productId.toString()));
		}
		User dbUser = optional.get();
		Product product = productopOptional.get();
		dbUser.getFavoriteProducts().add(product);
		userRepository.save(dbUser);
		return "The product has been successfully added to favorites:" + product.getProductName()+"\n";
	}

}
