package com.cw.exceptiondemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo5 {
	                      
	@SuppressWarnings({ "unused", "resource" })
	public static void read() throws FileNotFoundException
	{
	 
		FileInputStream fi=new FileInputStream("Z:\\info1.txt");
		 System.out.println("Reading a file....");
	     
		System.out.println("function terminated....");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
	
			read();
	
		
		int a=10,b=20;
		System.out.println("Sum= "+(a+b));
		
		if(a>b)
		System.out.println(a+" is max");
		else
     	System.out.println(b+" is max");
		
	}

}
