package com.exceptions.square;

public class SquareofNum {

	private int num;

	public SquareofNum() {
		
		num = 1;
	}
	
	public SquareofNum(int n) {
		
		num = n;
	}
	
	public void getSquare() throws ArithmeticException{
		
		if(num < 0) {
			   throw new ArithmeticException("Number is -ve !! Enter +ve numbers only !");
		   }
		
	   int square = num*num;
	   System.out.println(square);
	   
	   
	}

}
