package com.inheritance.electronicdevice;

public class ElectronicDeviceMain {
	
	public static void main(String [] args) {
		
		System.out.println("--------COMPUTER--------");
		Computer c1 = new Computer();
		System.out.println(c1);
		
		System.out.println();
		
		Computer c2 = new Computer("APPLE", "Grey", 100000, "Macbook");
		System.out.println(c2);
		
		System.out.println("\n");
		
		System.out.println("--------MOBILE PHONE--------");
		MobilePhone m1 = new MobilePhone();
		System.out.println(m1);
		
		System.out.println();
		
		MobilePhone m2 = new MobilePhone("APPLE", "Grey", 100000, "iPhone 15");
		System.out.println(m2);
		
		System.out.println("\n");
		
		System.out.println("--------LCD TV--------");
		LCD lcd1 = new LCD();
		System.out.println(lcd1);
		
		System.out.println();
		
		LCD lcd2 = new LCD("APPLE", "Grey", 100000, "TV 4K (2017 model)","Liquid-crystal display");
		System.out.println(lcd2);
		
		System.out.println("\n");
		
		System.out.println("--------LED TV--------");
		LED led1 = new LED();
		System.out.println(led1);
		
		System.out.println();
		
		LED led2 = new LED("APPLE", "Grey", 100000, "TV 4K(5th generation)","Light-emitting diode");
		System.out.println(led2);
				
		
	}

}
