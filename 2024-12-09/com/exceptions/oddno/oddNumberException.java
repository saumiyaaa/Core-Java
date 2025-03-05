package com.exceptions.oddno;

@SuppressWarnings("serial")
public class oddNumberException extends Exception{
	
	String msg;
	
	public oddNumberException() {
		
		msg = "Error";
	}
	
	public oddNumberException(String m) {
		super(m);
		msg = m;
	}	

}
