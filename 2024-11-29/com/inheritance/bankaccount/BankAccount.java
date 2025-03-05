package com.inheritance.bankaccount;

public class BankAccount {
	
	protected double balance;
	protected String name;
	protected double amount;
	
	protected BankAccount() {
		
		name = "Sam";
		balance = 50000;
		
	}
	
	protected BankAccount(String n, double bal) {
		
		name = n;
		balance = bal;
	}
	
	public double deposit(double amount) {
		
		return balance +=  amount;
	}
	
	public double withdraw(double amount) {
		
		if(amount>balance) {
			System.out.println("Not enough balance");
			return 0;}
		else {
			return balance -= amount;
		}		
		
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"Balance"+balance;
	}
	
		

}
