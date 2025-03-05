package com.abstracts.phone;

public class TestMain {

	public static void main(String[] args) {

		MobilePhone mb1 = new SimplePhone();
		mb1.makeCall();
		
		System.out.println("\n");
		
		MobilePhone mb2 = new SmartPhone();
		mb2.makeCall();

	}

}
