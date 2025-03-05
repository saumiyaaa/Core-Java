package com.multithread;

import java.util.Scanner;

public class MultiThread3 extends Thread{	

	private int num;
	
	public MultiThread3(int  num) {

		this.num = num;
	}
	
	public void run() {
		int sum = num;
			try {
				for(int i=1;i<=10;i++) {
			
					if(currentThread().getName().equals("Increment")) {
						
						System.out.println("Increment : "+(sum++)+" ");						
						Thread.sleep(500);

			}
				}
			
			if(currentThread().getName().equals("Multiplication")) {

				for(int j = 1; j<=10; j++) {
					System.out.println("Multiplication: "+num*j+" ");
					Thread.sleep(500);
			}
		}
	}

		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        // Accept two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Create and start threads
        MultiThread3 thread1 = new MultiThread3(num1);
        MultiThread3 thread2 = new MultiThread3(num2);
        
        thread1.setName("Increment");
        thread2.setName("Multiplication");
        
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        try {
			thread1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
        thread2.start();
       
        
        sc.close();
	}
	

}
