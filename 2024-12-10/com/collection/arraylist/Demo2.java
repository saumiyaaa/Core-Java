package com.collection.arraylist;

import java.util.ArrayList;
public class Demo2 {
	
	public static void main(String[] args) {
		
		ArrayList <Object> a = new ArrayList<>();
		
		a.add(new Student(1, "Sam", 95.0));
		a.add(new Student(2, "Mark", 59.87));
		a.add(new Student(3, "Ellie", 82.45));
		a.add(new Student(4, "Dave", 63.32));
		a.add(new Student(5, "Anna", 78.90));
		
		System.out.println(a);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Enter Your Choice ");
		System.out.println("1.Display\n2.Search\n3.Sort");
		
	}

}
