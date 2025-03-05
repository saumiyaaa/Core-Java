package com.exceptions.factorial;

public class Factorial {
	
	private double num;
	
	public Factorial() {
		
		num = 1;
	}
	
	public  Factorial(double n) {
		
		num = n;
		
	}
	
	public void calcFactorial() throws NegativeNumberException{
		
		if(num<0)
			throw new NegativeNumberException("Number is -ve !!!");
		
		double fact = 1;		
		for(int i = 1; i<=num; i++) {
			
			 fact *= i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}

}
