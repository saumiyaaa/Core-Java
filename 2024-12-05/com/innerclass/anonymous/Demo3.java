package com.innerclass.anonymous;

interface I1 { // Funtional Interface as it only has 1 method show() with String parameter
	
	public void showName(String nm);

}

public class Demo3 {
	
public static void main(String[] args) {
		
	   I1 i;
		
		// Using anonymous class
		 i = (String str) -> {
			
			System.out.println("Hello, my name is "+str);
		};
		
		/*1. If lamda has only 1 expression then curly braces {}; are optional
		 *  i = (String str) -> System.out.println("Hello, my name is "+str);		
		 */
		
		/*2. Data Type of parameter is optional
		 *  i = (str) -> System.out.println("Hello, my name is "+str);		
		 */
		
		/*3. If lamda has only 1 expression then paranthesis () is optional
		 *  i = str -> System.out.println("Hello, my name is "+str);		
		 */
		
		/*4. If lamda has only 1 expression but has return keyword then curly braces {}; are mandatory
		 *  i = (String str) -> return str;		
		 */
		
		/*4. If lamda has only 1 statement then return keyword is optional
		 *  i = (String str) -> str;		
		 */
		
		
		i.showName("Sam");
		
	}

}
