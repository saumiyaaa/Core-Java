package com.inheritance.player;

class HockeyPlayer extends Player {
    private String position; 
    
    public HockeyPlayer() {
    	
    	super();
    	position = "Forward"; 
    }
    
    public HockeyPlayer(String name, int age, String team, String pos) {
        super(name, age, team);
        position = pos;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Position: " + position;
    }
    
   }
