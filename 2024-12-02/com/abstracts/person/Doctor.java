package com.abstracts.person;

public class Doctor extends Person{
	

	double salary;
	String specializationType;
	
	public Doctor(String n, double s, String t) {
		super(n);
		salary = s;
		specializationType = t;
		
	}
	
    public void displayDetails(){
		
		System.out.println("Name: "+name+"\nSalary (in Rs): "+salary+"\nSpecialization Type: "+specializationType);
	}

	

}
