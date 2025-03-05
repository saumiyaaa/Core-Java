package com.customer;

public class Customer {

    private String name;
    private String email;
    private String phoneNumber;
    private String address;

    // Default constructor
    Customer() {
        name = "Hinali Patil";
        email = "hinuP@gmail.com";
        phoneNumber = "123-456-7890";
        address = "Hill View Residency, Warje, Pune";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to print customer details
    public void printDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }
}
