package com.exceptions.age;

public class Age {
	
	private int age;
	
	public Age() {
		
		age = 0;
	}
	
	public Age(int a) {
		
		age = a;
	}
	
	public void check_age() throws AgeIsInvalidException{
		
		if(age < 0)
			throw new AgeIsInvalidException("Invalid Age !");
		
		System.out.println("Age: "+age);
	}
	

}
