package com.exceptions.account;

public class Account {
	
	private int accNo;
	private String ownerName;
	private double balance;
	
	public Account() {

		accNo = 12345;
		ownerName = "Sam";
		balance = 10000;
	}

	public Account(int accNo, String ownerName, double balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void withdraw (double amt) throws insufficientBalanceException {
		
		if(balance-amt <1000) 
			
			throw new insufficientBalanceException("\nMinimum balance should be 1000 !");
			
			balance -= amt;
			System.out.println("\nWithdrawal of Rs "+amt+" done successfully!");	
		
	}
	
	public String toString() {
		
		return "\nAccount Number: "+accNo+"\nName of Owner: "+ownerName+"\nBalance: "+balance;
	}

}
