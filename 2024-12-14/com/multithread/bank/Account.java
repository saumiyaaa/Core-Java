package com.multithread.bank;

public class Account {
	
	private double balance;
	
	public Account() {
		
		balance = 0;
	}
	
	public Account (double bal) {
		
		balance = bal;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double bal) {
		
		balance = bal;
	}
	
	public String toString() {
		return "Balance "+balance;
	}

}
