package com.clonedemo;

public class CloneMain {

	public static void main(String[] args) {
		CloneDemo d1 = new CloneDemo(10,20);
		CloneDemo d2=d1; //Shallow Cloning
		
		System.out.println(d1);
		System.out.println(d2);
		
		if(d1==d2){
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		//Deep Cloning
		
		CloneDemo d3 = null;
		try {
			
		d3 = (CloneDemo)d1.clone();
		
		} catch(CloneNotSupportedException p) {
			
			p.printStackTrace();
		}
		
		System.out.println(d1);
		System.out.println(d3);
		
		if(d1==d3){
			
			System.out.println("same");
			
		} else {
			
			System.out.println("not same");
		}

	}

}