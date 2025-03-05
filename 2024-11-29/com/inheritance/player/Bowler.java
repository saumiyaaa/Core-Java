package com.inheritance.player;


class Bowler extends Cricketer {
 private int wicketsTaken; 
 private double bowlingAverage; 
 
 public Bowler() {
	 
	 wicketsTaken = 3;
	 bowlingAverage = 20.21;
 }

 // Constructor
 public Bowler(String name, int age, String team, int wicketsTaken, double bowlingAverage) {
     super(name, age, team, "Bowler");
     this.wicketsTaken = wicketsTaken;
     this.bowlingAverage = bowlingAverage;
 }
 

 @Override
 public String toString() {
     return super.toString() + ", Wickets Taken: " + wicketsTaken + ", Bowling Average: " + bowlingAverage;
 }

}
