package com.innerclass.simple;

public class Account {
	
	private int accno;
	private String nameString;
	private double balance;
	
	public Account() {

		accno = 1234;
		nameString = "Sam";
		balance = 34000.0;
	}
	
	class Locker{
		
		int lockerID;
		
		public Locker() {

			lockerID = 312;
			
		}
		
		public void print() {
			
			System.out.println("Account No: "+accno+"\nName: "+nameString+"\nBalance: "+balance+"\nLocker ID: "+lockerID);
		}
	}

}
