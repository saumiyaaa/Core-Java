package com.methodref.person;

import java.util.ArrayList;
import java.util.Collections;

public class MainClassName {
	
	public static void main(String[] args) {
		
		ArrayList<Person> arr = new ArrayList<>();
		
		arr.add(new Person(30, "Kakashi Hatake"));
		arr.add(new Person(17, "Naruto Uzumaki"));
		arr.add(new Person(17, "Sasuke Uchiha"));
		arr.add(new Person(17, "Sakura Haruno"));
		
		PersonComparator pComparator = new PersonComparator();
		/*
		 * Since compareName is not static, we have to create instance of its class
		 * and then use an instance method reference in the Collections.sort() call.
		 */
		
		Collections.sort(arr, pComparator :: compareName);		
		
		for(Person person : arr) {
			System.out.println(person.getName());
			

		}
	}
}
