package com.string.tokenization;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Demo {
	
	public static void main(String[] args) {
		
		//delimeter - symbol based on which tokens are formed
		// default delimeter is white space
		//tokens
		
		StringTokenizer  st = new StringTokenizer("good to learn ! java ! IO", "!");
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
			
		}
		 Scanner sc = new Scanner("I live in Pune");
		 while (sc.hasNext()) {
			System.out.println(sc.next());
			
		}
		 
		 sc.close();
		
		
	}

}
