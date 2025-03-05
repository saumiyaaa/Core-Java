package com.exceptions.age;

@SuppressWarnings("serial")
public class AgeIsInvalidException extends Exception{
	
	String msg;
	
	public AgeIsInvalidException() {
		
		msg = "Error";
	}
	
	public AgeIsInvalidException(String m) {
		
		super(m);
		msg= m;
		
	}

}
