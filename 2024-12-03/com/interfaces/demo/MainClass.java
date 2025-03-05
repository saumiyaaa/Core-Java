package com.interfaces.demo;

public class MainClass {
	
	public static void main(String [] args) {
		
		Printable ob1 = new Developer();
		ob1.print();
		
		System.out.println("\n");
		

		Printable ob2 = new Student(21, "Sharon", 1234);
		ob2.print();
		
		System.out.println("\n\n");
		
		Printable ob3 = new Date();
		ob3.print();
		
		Printable ob4 = new Employee();
		ob4.print();
		
		Printable ob5 = new Shape();
		ob5.print();			
		
	}


}
