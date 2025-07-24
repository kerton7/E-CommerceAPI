package com.alituran.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.alituran.exception.BaseException;

@ControllerAdvice
public class GlobalExceptionHandler {
 
	
	@ExceptionHandler(value = BaseException.class)
	public ResponseEntity<String> BaseExceptionHandler(BaseException exception){
		return ResponseEntity.badRequest().body(exception.getMessage());
	
	}
	
	
	
}
