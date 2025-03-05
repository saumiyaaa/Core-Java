package com.main;

import static com.shapes.Circle.getPI;

import com.shapes.Circle;

public class ShapeMain {

	public static void main(String[] args) {

	System.out.println( getPI()); 
	
	//Circle c = new Circle();
	
	System.out.println( new Circle().area()+" square cm"); 
    

	}

}
