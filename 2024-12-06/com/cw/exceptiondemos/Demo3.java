package com.cw.exceptiondemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Demo3 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		FileInputStream fi=null;

    try {
		fi=new FileInputStream("Z:\\info118.txt");
		 System.out.println("Reading a file...");
    }
    catch(FileNotFoundException e)
    {
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


