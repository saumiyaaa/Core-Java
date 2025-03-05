package com.student;

// A class representing a student
public class Student {

    // Private instance variables for encapsulation
    private int rollNo;         // Roll number of the student
    private double percentage;  // Percentage scored by the student
    private String name;        // Name of the student

    // Method to initialize student details with default values
    public void initStudent() {
        name = "SAM";           // Default name
        rollNo = 6;             // Default roll number
        percentage = 90.00;     // Default percentage
    }

    // Getter for roll number
    public int getRollNo() {
        return rollNo;
    }

    // Setter for roll number
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for percentage
    public double getPercentage() {
        return percentage;
    }

    // Setter for percentage
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Percentage : " + percentage + "%");
    }
}
