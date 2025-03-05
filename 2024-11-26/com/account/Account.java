package com.account;

// Class representing a bank account
public class Account {
	
	// Private member variables to store account details
	private int accNo;         // Account number
	private String ownerName;  // Name of the account holder
	private double balance;    // Account balance
	
	// Method to initialize account details with default values
	public void initAccount() {
		accNo = 291738;
		ownerName = "Payel";
		balance = 4097308.78;
	}
	
	// Getter method for retrieving the account number
	public int getAccNo() {
		return accNo;
	}
	
	// Setter method for updating the account number
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	// Getter method for retrieving the owner's name
	public String getOwnerName() {
		return ownerName;
	}
	
	// Setter method for updating the owner's name
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	// Getter method for retrieving the account balance
	public double getBalance() {
		return balance;
	}
	
	// Setter method for updating the account balance
	public void setBalance(double bal) {
		balance = bal;
	}
	
	// Method to print account details
	public void printDetails() {
		System.out.println("ACCOUNT NO : " + accNo);
		System.out.println("OWNER NAME : " + ownerName);
		System.out.println("BALANCE : " + balance);
	}
}
