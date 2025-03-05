package com.inheritance.person;

public class Person {
	
	protected String name;
	protected Date dob; //containment
	protected Address address; // containment
	
	protected Person() {
		
		name = "Sam";
		dob = new Date();
		address = new Address();
	}
	
	protected Person(String n, Date d, Address a) {
		
		name = n;
		dob = d;
		address = a;
	}
	
	@Override
	public String toString() {
		return ("Name: "+name+"\nDate of Birth: "+dob+"\nAddress: "+address);
	}

}
