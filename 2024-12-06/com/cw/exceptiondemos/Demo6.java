package com.cw.exceptiondemos;

public class Demo6 {
	
	public static void division()
	{
		int n=10, d=0;
		
		if(d==0)
			throw new ArithmeticException("Can Not Divide By ZERO.....");
		float div= (float)n/d;
		System.out.println(div);
		
	}
	
	public static void main(String[] args) {
		
		try {
		division();
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			
			System.err.println(e.getMessage());
		}
		int a=10,b=20;
		System.out.println("Sum= "+(a+b));
		
		if(a>b)
		System.out.println(a+" is max");
		else
     	System.out.println(b+" is max");
	}

}
