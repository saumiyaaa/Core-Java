package com.cw.exceptiondemos;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int arr[]={10,20,30,40};
	
	 try {
		for(int i=0;i<6;i++)
		{
			System.out.println(arr[i]);
		}
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 //System.err.println("Invalid index..");
		 e.printStackTrace();
	 }
		int a=10,b=20;
		System.out.println("Sum= "+(a+b));
		
		if(a>b)
		System.out.println(a+" is max");
		else
     	System.out.println(b+" is max");

	}

}





