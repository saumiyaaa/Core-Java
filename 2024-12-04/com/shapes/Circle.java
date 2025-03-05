package com.shapes;

public class Circle {
	
	private double radius;
	public static float PI = 3.14f;
	
	public Circle() {
		
		radius = 5;
	}
	
	public static float getPI() {
		
		return PI;
		
	}
	
	public double area() {
		
		return PI*radius*radius;
	}
	
	public void display() {
		
		System.out.println(area());
		
	}
	
	

}
