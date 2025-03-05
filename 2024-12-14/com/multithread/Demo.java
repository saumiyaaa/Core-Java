package com.multithread;

public class Demo extends Thread {
	
	public void run() {
		
		try {
		for(int i=1;i<=5;i++) {
			
			if(currentThread().getName().equals("Shyam")) {
				System.out.println("Hi..."+getName());
				Thread.sleep(50);
			}
			
			if(currentThread().getName().equals("Ram")) {
			System.out.println("Bye..."+getName());
			Thread.sleep(50);
			}
		}
		}
		
		//System.out.println(getName());
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
		
	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.setName("Shyam");
		d1.start();
		
		Demo d2=new Demo();
		d2.setName("Ram");
		d2.start();
	}

}
