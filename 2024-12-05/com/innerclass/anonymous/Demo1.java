package com.innerclass.anonymous;

// ANONYMOUS CLASS USING INTERFACE

 interface INTERFACE1 { // Funtional Interface as it only has 1 method show()
	
	public void show();

}

public class Demo1 {
	
	public static void main(String[] args) {
		
		
		// Using anonymous class
		INTERFACE1 interface1 =  new INTERFACE1() {
			
			@Override
			public void show() {

	       System.out.println("Hello from Anonymous Class");
				
			}
		};
		
		// Using lambda expression as interface has only 1 abstract method
		INTERFACE1 interface2 = () -> {
			
			System.out.println("Hello ffrom Lambda");
		};
		
		interface1.show();
		interface2.show();
		
	}

}
