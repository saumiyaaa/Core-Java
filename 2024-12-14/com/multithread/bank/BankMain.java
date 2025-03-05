package com.multithread.bank;

public class BankMain extends Thread{

	public static void main(String[] args) {

		Account obAccount = new Account(10000);
		
		Transaction t1 = new Transaction("Ram", obAccount);
		Transaction t2 = new Transaction("Shyam", obAccount);
		
		t1.start();
		t2.start();

	}

}
