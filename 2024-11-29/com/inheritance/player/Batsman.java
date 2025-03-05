package com.inheritance.player;

class Batsman extends Cricketer {
    private int runsScored;
    private int centuries; 
    
    public Batsman() {
    	
    	runsScored = 76;
    	centuries = 100;
    }

    // Constructor
    public Batsman(String name, int age, String team, int runsScored, int centuries) {
        super(name, age, team, "Batsman");
        this.runsScored = runsScored;
        this.centuries = centuries;
    }
    
 
    @Override
    public String toString() {
        return super.toString() + ", Runs Scored: " + runsScored + ", Centuries: " + centuries;
    }

}
