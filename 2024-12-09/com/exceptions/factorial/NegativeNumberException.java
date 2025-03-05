package com.exceptions.factorial;

@SuppressWarnings("serial")
public class NegativeNumberException extends Exception{
	
String msg;
	
	public NegativeNumberException() {
		
		msg = "Error";
	}
	
	public NegativeNumberException(String m) {
		
		super(m);
		msg= m;
		
	}

}
