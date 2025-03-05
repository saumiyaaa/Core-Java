package com.containment;

public class Address {
	
	private String city, state;
    private int pinCode;
    
    public Address() {
    	
    	city = "Pune";
    	state = "Maharshtra";
    	pinCode = 411058;
    }
    
 public Address(String city, String state, int pinCode) {
    	
    	this.city = city;
    	this.state = state;
    	this.pinCode = pinCode;
    }
 
 public String toString() {
		return("\nCity: "+city + "\nState: " + state + "\nPinCode: " + pinCode);
	}
 
 public static void main(String [] args) {
	
	 Address a1 = new Address();
     System.out.println(a1);
     
     System.out.println();
     
     Address a2 = new Address("Chennai", "Tamil Nadu", 600011);
     System.out.println(a2);
     
}

}
