package com.vararg;

public class StudentMarks {
	
	public void Marks(String name, int ... m) {
		
		int sum = 0;
		
		for(int a : m) {
			
			sum += a;
		}
		
		float avg = sum/m.length;
		
		System.out.println("STUDENT NAME: "+name+"\nAVERAGE MARKS: "+avg);
		System.out.println();
		
	}

	public static void main(String[] args) {

		StudentMarks studentMarks = new StudentMarks();
		
		studentMarks.Marks("SAM", 90, 87, 96);
		
		studentMarks.Marks("PAYEL", 91, 82, 79);
		
		studentMarks.Marks("RIYA", 92, 60, 73);

	}

}
