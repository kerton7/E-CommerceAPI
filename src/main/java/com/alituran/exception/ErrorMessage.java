package com.alituran.exception;



public enum ErrorMessage {

	NO_STOCK("Current stock is insufficient"),
	NO_VALUE("Id value could not be found");
	
	
	private String message;
	

	private ErrorMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	
	
	
	
	
}
