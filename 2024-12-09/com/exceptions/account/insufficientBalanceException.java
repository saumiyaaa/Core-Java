package com.exceptions.account;

@SuppressWarnings("serial")
public class insufficientBalanceException extends Exception{
	
	String msg;
	
	public insufficientBalanceException() {
		
		msg = "Balance Error";
	}

	public insufficientBalanceException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public String getMsg() {
		
		return msg;
	}
	
	
	

}
