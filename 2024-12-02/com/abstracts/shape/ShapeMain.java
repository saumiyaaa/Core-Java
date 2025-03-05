package com.abstracts.shape;

public class ShapeMain {
	


		public static void main(String[] args) {
			//Shape s = new Shape(); //not possible as abstract cls obj cannot be created
			Shape s1 = new Circle();
			
			s1.draw();
			s1.fillColor();
			
			//Type Casting
			((Circle)s1).Area();
			
			System.out.println("\n");
			
			Shape s2 = new Rectangle();
			
			s2.draw();
			s2.fillColor();
			
			//Type Casting
			((Rectangle)s2).Area();
			
			
		}

	}


