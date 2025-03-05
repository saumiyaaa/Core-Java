package com.interfaces.demo;

public class Shape implements Printable{

		
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

		
		public void fillColor() {
			System.out.println("Fill with color : "+scolor);
		}
		
		public void print() {
			
			System.out.println("This is class Shape.");
			
		}

	
}
