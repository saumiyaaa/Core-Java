package com.collections.employee;

import java.util.LinkedList;
import java.util.Scanner;

public class AddUtil {
	
public static void add(LinkedList<Employee> list,Scanner sc) {
	
	//Scanner sc = new Scanner(System.in);
	   
		//LinkedList <Object> l = (LinkedList) o;
		System.out.println("\n\nEnter the elements to add as follows ");
		System.out.println("\nEnter Name ");
		String n = sc.nextLine();
		System.out.println("Enter Salary ");
		double sal = sc.nextDouble();
		sc.nextLine();
		//System.out.println("Enter the position ");
		//int pos = sc.nextInt();
		
		list.add(new Employee(n, sal));
		
				
	}

}
