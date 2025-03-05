package com.containment;

public class Account {
	
	private int accno;
	private String name;
	private double bal;
	private Date acDate;
	private Address address;
	
	public Account () {
		accno = 123;
		name = "Sam";
		address = new Address();
		bal = 200000;
		acDate = new Date();
	}
	
	public Account (int accno, String name, double bal, Date d, Address a) {
		this.accno = accno;
		this.name = name;
		this.bal = bal;
		acDate = d;
		address = a;
	}
	
	public String toString() {
		return ("Account No: "+accno+"\nOwner's Name: "+name+"\nAddress: "+address+"\nBalance: "+bal+"\nAccount Creation Date: "+acDate);
	}

}
