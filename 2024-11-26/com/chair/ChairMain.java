package com.chair;

public class ChairMain {

    public static void main(String[] args) {
        // Creating an object of Chair using the default constructor
        Chair chair = new Chair();
        
        // Printing the initial details of the chair
        chair.printDetails();
        
        // Changing the properties of the chair
        System.out.println();       
        
        chair.getMaterial();
        chair.setMaterial("Metal");
        chair.getColor();
        chair.setColor("Black");
        chair.getHeight();
        chair.setHeight(1.2);  // in meters
        chair.getArmrests();
        chair.setArmrests(false);
        
        // Printing the updated details of the chair
        chair.printDetails();
    }
}
