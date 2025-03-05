package com.abc.college;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Library library = new Library();
		    
		
		while (true) {
			
		System.out.println("1.Add Books\n2.Check if booklist is Empty\n3.View all Books\n4.View Books by Author\n5.Check no of books available");
		System.out.println("\nEnter your choice: ");
		int ch = sc.nextInt();
		sc.nextLine();
		
		if(ch<1 || ch>5) {
			System.out.println("Wrong Choice !!! Enter Again");
			continue;
		}
		
		switch (ch) {
		case 1: {
			System.out.println("\nEnter book details to add as follows - ");
			System.out.println("\nEnter ISBN Number: ");
			int no = sc.nextInt();
			sc.nextLine();
			System.out.println("\nEnter Name of the Book: ");
			String bk = sc.nextLine();
			System.out.println("\nEnter Name of the Author: ");
			String nm = sc.nextLine();
						
			library.add(new Book(no, bk, nm));
			
			break;
		}
			
		case 2:{
			
		    System.out.println(library.isEmpty());
			break;
		}
		
		case 3:{
			
			//System.out.println(library.viewAllBooks());
			for(Book bk : library.viewAllBooks()) {
				System.out.println(bk);
				System.out.println();
			}
			break;
		}

		case 4:{
			
	        System.out.println("\nEnter name of Author whose books you want: ");
	        String nm = sc.nextLine();	        
	        System.out.println("\nBooks by Author "+nm+" are as follows - \n");
	        for(Book bk : library.viewBooksByAuthor(nm)) {
				System.out.println(bk);
				System.out.println();
			}
	        break;
		}
		
		case 5:{
			
			System.out.println("\nEnter name of the Book you want: ");
	        String bk = sc.nextLine();	
	        System.out.println("No of Books Available are: "+library.countBooks(bk));	
	        
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + ch);
		}
		
		System.out.println("\ndo you want to continue? (0/1)");
		int m = sc.nextInt();
		sc.nextLine();
		if (m == 0) {
		    System.out.println("----------Thankyou----------");
			break;
		} else {
			if (m != 1) {
				System.out.println("\nWrong Choice! Enter Again");
				continue;
			}
		}
		
	}
		sc.close();
		
}

}
