package com.exceptions.oddno;

public class OddNo {
	
	private int num;
	
	public OddNo() {
		num = 1;
	}
	
	public OddNo(int n) {
		
		num = n;
	}
	
	public void checkOdd () throws oddNumberException{
		
		if(num % 2 != 0)
			throw new oddNumberException("Number is Odd !");
		
		System.out.println(num+" - Number is not odd ! ");
		
	}

}
