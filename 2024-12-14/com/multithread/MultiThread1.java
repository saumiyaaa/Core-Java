package com.multithread;

import java.util.Scanner;

public class MultiThread1  extends Thread{
	
	private int task;
	private int num;
	
	public MultiThread1(int task, int  num) {
		super();
		this.task = task;
		this.num = num;
	}

	public void run() {
		
		if(task == 1) {
			System.out.println("Thread 1 : ");
			int sum = num;
			for(int i = 1; i<=10; i++) {
			try {
				
				System.out.print(sum+" ");
				sum++;
				Thread.sleep(500);
				
				
			    } catch (InterruptedException e) {
				e.printStackTrace();
			        }			
				
			}
		} else if (task == 2) {
			System.out.println("Thread 2 : ");
			try {
				
				for(int i = 1; i<=10; i++) {
					System.out.print(num*i+" \n\n");
					Thread.sleep(500);
					
				}				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
	        }
			
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
        MultiThread1 thread1 = new MultiThread1(1, num1);
        MultiThread1 thread2 = new MultiThread1(2, num2);
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
       
        
        sc.close();
	}

}
