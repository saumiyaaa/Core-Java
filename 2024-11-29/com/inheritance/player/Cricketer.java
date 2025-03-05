package com.inheritance.player;

class Cricketer extends Player {
    private String role; 
    
    public Cricketer(){
    	
    	super();
    	role = "Batsman";
    }
    // Constructor
    public Cricketer(String name, int age, String team, String r) {
        super(name, age, team);
        role = r;
    }
    
    // toString method to display Cricketer details
    @Override
    public String toString() {
        return super.toString() + ", Role: " + role;
    }

}
