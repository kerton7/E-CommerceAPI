package com.alituran.exception;




public class TypeMessage {
	
	private ErrorMessage errorMessage;
	
	private String staticString;
	
	public String prepareMessgae() {
		StringBuilder stringBuilder = new StringBuilder();	
		stringBuilder.append(errorMessage.getMessage());		
		if(stringBuilder!=null) {
			stringBuilder.append(" Id:" + staticString);
		}
		return stringBuilder.toString();
	}

	public TypeMessage(ErrorMessage errorMessage, String staticString) {
		super();
		this.errorMessage = errorMessage;
		this.staticString = staticString;
	}

      public TypeMessage() {
	
}

	public ErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStaticString() {
		return staticString;
	}

	public void setStaticString(String staticString) {
		this.staticString = staticString;
	}
	
	
	

}
