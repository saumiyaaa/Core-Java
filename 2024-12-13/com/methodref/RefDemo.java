package com.methodref;


public class RefDemo {
	
	public static void main(String[] args) {
		
		// Using Lambda
		 System.out.println("\nUsing Lambda");
		 WorkInterface wInterface = ()->{
		 MethodRef ob = new MethodRef();
			ob.doSomething();			
			
		};
		wInterface.doTask();
		 
		
		//Using Method Reference
		System.out.println("\nUsing Method Reference non-static"); 
		 MethodRef ob1 = new MethodRef();
		 WorkInterface wInterface1 = ob1 :: doSomething;
		 wInterface1.doTask();
		 
		 System.out.println("\nUsing Method Reference static"); 
		WorkInterface wInterface2 = MethodRef :: doingTask;
		wInterface2.doTask();
	}

}
