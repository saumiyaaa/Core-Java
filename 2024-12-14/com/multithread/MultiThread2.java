package com.multithread;

import java.util.Scanner;

public class MultiThread2 extends Thread{
	
	
	 public static void main(String[] args) {	
		 
		 Scanner sc = new Scanner(System.in);

	     // Accept two numbers from the user
	     System.out.print("Enter the first number: ");
	     int num1 = sc.nextInt();

	     System.out.print("Enter the second number: ");
	     int num2 = sc.nextInt();

	
		Thread t1 = new Thread(()->{
			int num = num1;
			for(int i=1; i<=10; i++) {
				System.out.println("Increment : "+(num++)+" ");
				
			}			
		});
		
		Thread t2 = new Thread(()->{
			int num = num2;
			for(int i=1; i<=10; i++) {
				System.out.println("Multiplication: "+num*i+" ");
			}			
		});
		
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
       
        
        sc.close();
		
	}

}
