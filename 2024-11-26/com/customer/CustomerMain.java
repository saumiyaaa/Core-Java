package com.customer;

public class CustomerMain {

    public static void main(String[] args) {
        // Creating an object of Customer using the default constructor
        Customer customer = new Customer();
        
        // Printing the initial details of the customer
        customer.printDetails();
        
        System.out.println();
        
     // Changing the values of the customer
        customer.getName();
        customer.setName("Shivani");
        customer.getEmail();
        customer.setEmail("shivani08@gmail.com");
        customer.getPhoneNumber();
        customer.setPhoneNumber("987-654-3210");
        customer.getAddress();
        customer.setAddress("Sage Hostel, Karve Nagar, Pune");
        
        // Printing the updated details of the customer
        customer.printDetails();
    }
}
