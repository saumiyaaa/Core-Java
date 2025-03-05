package com.inheritance.player;

class FootballPlayer extends Player {
    private String position; // Position in the game (e.g., Striker, Midfielder, Defender)

    public FootballPlayer() {
    	
    	position = "Striker";
    }
    
    // Constructor
    public FootballPlayer(String name, int age, String team, String position) {
        super(name, age, team);
        this.position = position;
    }

   
    @Override
    public String toString() {
        return super.toString() + ", Position: " + position;
    }

}
