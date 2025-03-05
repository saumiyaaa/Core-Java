package com.multithread.bank;

public class Transaction extends Thread{
	
	Account objAccount;
	
	public Transaction() {
		
	}
	
	public Transaction(String name, Account a) {
		
		super(name);
		objAccount = a;
		
	}	
	
	public void withdraw(double amt) {
		
		synchronized (objAccount) {
			
			double bal = objAccount.getBalance();
			System.out.println("Balance before withdrawing money Rs"+amt+": Rs"+bal);
			bal = bal - amt;
			objAccount.setBalance(bal);
			System.out.println("Balance after withdrawing money Rs"+amt+": Rs"+bal);			
			
		}
	}
	
	public void deposit(double amt) {
		
		synchronized (objAccount) {
			
			double bal = objAccount.getBalance();
			System.out.println("Balance before depositing money Rs"+amt+": Rs"+bal);
			bal = bal + amt;
			objAccount.setBalance(bal);
			System.out.println("Balance after depositing money Rs"+amt+": Rs"+bal);			
			
		}
	}
	
	public void run() {
		if(Thread.currentThread().getName().equals("Ram"))
			deposit(2000);
		if(Thread.currentThread().getName().equals("Ram"))
			withdraw(4000);
	}

}
