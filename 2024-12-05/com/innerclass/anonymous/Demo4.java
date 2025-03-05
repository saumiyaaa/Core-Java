package com.innerclass.anonymous;

interface LambdaWithReturn { // Funtional Interface as it only has 1 method show() with String parameter
	
	public int multiply(int x, int y);

}


public class Demo4 {
	
	public static void main(String[] args) {
		
		LambdaWithReturn ob;
		
		ob = (x,y) -> {
						int mul = (x*y);
		                return mul;
		                };
		                
	   int cube = ob.multiply(3,4);
	   System.out.println(cube);
	}

}
