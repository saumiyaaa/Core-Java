package com.chair;

public class Chair {

    private String material;
    private String color;
    private double height;
    private boolean armrests;

    // Default constructor
    Chair() {
        material = "Wood";
        color = "Brown";
        height = 1.5; // in meters
        armrests = true;
    }

    // Getters and Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean getArmrests() {
        return armrests;
    }

    public void setArmrests(boolean armrests) {
        this.armrests = armrests;
    }

    // Method to print chair details
    public void printDetails() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height + " meters");
        System.out.println("Has Armrests: " + (armrests ? "Yes" : "No"));
    }
}
