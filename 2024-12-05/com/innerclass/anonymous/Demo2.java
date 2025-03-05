package com.innerclass.anonymous;

class Show{
	
	public void print() {
		
		System.out.println("This is superclass");
	}
}

public class Demo2 {
	
	public static void main(String[] args) {
		
		Show show = new Show(){
			
			public void print() {
				
				System.out.println("This is Anonymous Class");
				
			}
		};
		
		show.print();
		
	}

}
