package com.cw.exceptiondemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo4 {
	
	@SuppressWarnings({ "null" })
	public static void main(String[] args) {
		
		try
		{
		FileInputStream fi=new FileInputStream("Z:\\info11.txt");
		System.out.println("Reading a file...");
		fi.close();
		int arr[]={10,20,30,40};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	
		Emp e1=null;
		e1.print();
		
		System.out.println("try block terminated...");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(NullPointerException e)
		{
			System.out.println("you are in NullPointerException...");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("you are in ArrayIndexOutOfBoundsException...");
			e.printStackTrace();
		}
		catch(Exception e)
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
