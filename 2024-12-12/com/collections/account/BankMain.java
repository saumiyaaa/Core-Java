package com.collections.account;

import java.util.ArrayList;
import java.util.Iterator;

public class BankMain {

	public static void main(String[] args) {

		ArrayList <Account> acc = new ArrayList<>(); 

		
		acc.add(new Account(12, "Harry Potter"));
		acc.add(new Account(23, "Lily Potter"));
		acc.add(new Account(43, "James Potter"));
		acc.add(new Account(56, "Severus Snape"));
		acc.add(new Account(89, "Albus Dumbeldore"));
		
		System.out.println("\nIterator Using while loop\n");
		
		Iterator <Account> iterator = acc.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("\n"+iterator.next());
			
		}
		
		System.out.println("\n-----------------------------------------------------------------------");
		
		System.out.println("\nIterator Using for loop\n");
		
		for (Iterator <Account> iterator1 = acc.iterator(); iterator1.hasNext();) {
				System.out.println("\n"+iterator1.next());
			
		}

	}

}
