package com.scanner.calc;

public class Calculator {
	
	private double n1, n2;
	
	public Calculator() {

        n1 = 0;
        n2 = 0;
	}
	
	public Calculator(double n1, double n2) {
		
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public double add(double n1, double n2) {
		
		return n1+n2;
	}
	
	public double subtraction(double n1, double n2) {
		
		if(n1>n2) {
			return n1-n2;
		}
		else {
			return n2-n1;
		}
	}
	
	public double multiply(double n1, double n2) {
		
		return n1*n2;
	}
	
	public double divide(double n1, double n2) {
		
		return n1/n2;
	}
	
	public String toString() {
		
		return "\nNumber 1: "+n1+"\nNumber 2: "+n2;
	}

}


