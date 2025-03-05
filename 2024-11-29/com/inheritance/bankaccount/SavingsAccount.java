package com.inheritance.bankaccount;

public class SavingsAccount extends BankAccount{
	
	protected double min_bal;	
	

	public SavingsAccount() {
		super();
		min_bal = 2000.0;
	}



	public SavingsAccount(String n, double bal,double min_bal) {
		super(n, bal);
		this.min_bal = min_bal;
	}
	
	
	public double withdraw(double amount) {
		
		if(amount>min_bal) {
			System.out.println("Not enough balance");
			return 0;}
		else {
			return balance -= amount;}
		}	
	
	@Override
	public String toString() {
		return super.toString()+"Name: "+name+"Balance"+balance;
	}
	
	
	
	

}
