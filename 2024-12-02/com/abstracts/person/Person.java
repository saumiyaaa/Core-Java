package com.abstracts.person;

public abstract class Person {
	
	String name;
	
	public Person(String n) {
		
		name = n;
	}
	
	public abstract void displayDetails();
	
	/*{
		
		System.out.println("Name: "+name);
	}  */

}
