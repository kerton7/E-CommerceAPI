package com.alituran.exception;



public class BaseException extends RuntimeException {
	
	public BaseException(TypeMessage typeMessage) {
		super(typeMessage.prepareMessgae());
	}
	
	public BaseException() {
		
	}
}
