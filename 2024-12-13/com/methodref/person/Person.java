package com.methodref.person;

interface PersonFactory{
	
	Person get(int a, String name);
}

public class Person {
	
	int age;
	String name;
	
	public Person(int a , String name){
		
		age = a;
		this.name = name;
		
	}
	
	public int getAge() {
		
		return age;
	}
	
	public String getName() {
		
		return name;
	}
	
	public String toString() {
		
		return "Age : "+age+" "+"Name : "+name;
	}
	
	//Reference to Constructor
	public static void main(String[] args) {
		
		PersonFactory personFactory = Person :: new;
		System.out.println("Consturctor is not called yet...");
		System.out.println(personFactory.get(17, "Harry Potter"));
	}
}

