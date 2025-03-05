package com.abstracts.shape;

public class Circle extends Shape{	

		
		private float radius;
		
		public Circle() {
			radius = 2.3f;
		}
		public Circle(String s, float r) {
			super(s);
			radius = r;
		}
		
		public void Area() {
			final float pi = 3.14f;
			System.out.println("Area of Circle: "+radius*radius*pi);
		}
		
		public void draw() {
			System.out.println("Draw circle");
		}
		
	}


