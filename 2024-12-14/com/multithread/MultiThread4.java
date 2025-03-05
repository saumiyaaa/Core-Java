package com.multithread;

import java.util.Scanner;

public class MultiThread4 extends Thread {	

    private int num;

    public MultiThread4(int num) {
        this.num = num;
    }

    public void run() {
        int sum = num;
        try {
            // Check thread name for Increment thread
            if (currentThread().getName().equals("Increment")) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Increment : " + (sum++) + " ");
                    Thread.sleep(500);
                    Thread.yield(); // Yield the processor to other threads
                }
            }

            // Check thread name for Multiplication thread
            if (currentThread().getName().equals("Multiplication")) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Multiplication: " + num * j + " ");
                    Thread.sleep(500);
                    Thread.yield(); // Yield the processor to other threads
                }
            }
        } catch (InterruptedException e) {
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
        MultiThread4 thread1 = new MultiThread4(num1);
        MultiThread4 thread2 = new MultiThread4(num2);

        thread1.setName("Increment");
        thread2.setName("Multiplication");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        // Start the threads
        thread1.start();
        thread2.start();

        sc.close();
    }
}
