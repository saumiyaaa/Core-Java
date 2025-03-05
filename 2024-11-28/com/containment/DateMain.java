package com.containment;

public class DateMain {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		System.out.println(a1);
		
		System.out.println();
		
		Account a2 = new Account(687,"Anna",786345,new Date(4,7,2013), new Address("Nashik","Maharashtra",422005));
		System.out.println(a2);
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println();
		
		Student s1 = new Student();
		System.out.println(s1);
		
		System.out.println();
		
		Student s2 = new Student(43,"Tim",new Date(6,12,2012), new Address("Bhopal", "Madhya Pradesh", 462007));
		System.out.println(s2);

	}

}
