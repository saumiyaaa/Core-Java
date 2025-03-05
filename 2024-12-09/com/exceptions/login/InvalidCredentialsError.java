package com.exceptions.login;

@SuppressWarnings("serial")
public class InvalidCredentialsError extends Exception{
	
	String msg;
	
	public InvalidCredentialsError() {
		
		msg = "Error";
	}
	
	public InvalidCredentialsError(String m) {
		
		super(m);
		msg = m;
		
	}

}
