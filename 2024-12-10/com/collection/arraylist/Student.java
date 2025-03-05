package com.collection.arraylist;

public class Student {
	
		protected int studId;
		protected String name;
		protected double pct;
		
		public Student(int id, String n, Double p) {
			
			studId = id;				
			name = n;
			pct = p;
		}
		
		public String toString() {
			
			return "Student ID: "+studId+"  Student Name: "+name+"  Percentage: "+pct+"\n";
		}
		


}
