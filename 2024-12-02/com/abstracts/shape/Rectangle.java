package com.abstracts.shape;

public class Rectangle extends Shape{
	
	private float length, breadth;
	
	public Rectangle() {
		
		length = 10.0f;
		breadth = 5.0f;
	}
	
	public Rectangle(String s,float l, float b) {
		
		super(s);
		length = l;
		breadth = b;		
	}
	
	public void draw() {
		
		System.out.println("Draw Rectangle");
	}
	
	public void Area() {
		
		System.out.println("Area of Rectangle: "+length*breadth);
	}

}
