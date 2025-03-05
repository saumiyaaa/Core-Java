package com.interfaces.shape;

public class InterfaceMain {
	
	public static void paint(Drawable d) {
		
		d.draw();
		System.out.println("\n");
		
	}

	public static void main(String[] args) {
		
		paint(new Circle());
		//Drawable d1 = new Circle();
       //paint(d1);       
     
		paint(new Rectangle());
       //Drawable d2 = new Rectangle();
       //paint(d2);
       
		paint(new Triangle());
		//Drawable d3 = new Triangle();
       //paint(d3);		

	}

}
