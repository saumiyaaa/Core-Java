package com.containment;

public class Student {
	
	private int rollno;
	private String name;
	private Address address;
	private Date dob;
	
	public Student () {
		rollno = 123;
		name = "Sam";
		address = new Address();
		dob = new Date();
	}
	
	public Student (int rollno, String name, Date d, Address a) {
		this.rollno = rollno;
		this.name = name;
		address = a;
		dob = d;
	}
	
	public String toString() {
		return ("Roll No: "+rollno+"\nStudent's Name: "+name+"\nDate of Birth: "+dob+address);
	}


}
