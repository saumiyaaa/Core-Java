package com.abstracts.shape;

public abstract class Shape {

		
		private String scolor;
		
		public Shape() {
			scolor = "black";
		}
		public Shape(String s) {
			scolor = s;
		}
		
		public String getScolor() {
			return scolor;
		}
		
		public abstract void draw(); //abstract method should have abstract class is necessary
		
		public abstract void Area();
		
		public void fillColor() {
			System.out.println("Fill with color : "+scolor);
		}

	
}
