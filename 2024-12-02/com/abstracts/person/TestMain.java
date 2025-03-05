package com.abstracts.person;

public class TestMain {
	
	public static void show(Person p) {
		
		p.displayDetails();
		((Nurse) p).calculatePayment();
		
	}

	public static void main(String[] args) {
		
		Person person1 = new Doctor("Sam", 190000.0, "Gynecologist");
		//show(person);
		person1.displayDetails();
		
		System.out.println("\n");
		
		Person person2 = new Nurse("Grace", 40,"0700 hrs to 1500 hrs" , 120);
		show(person2);

	}

}
