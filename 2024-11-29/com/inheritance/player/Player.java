package com.inheritance.player;

public class Player {
	 
  protected String name, team;
  protected int age;
  
  public Player(){
    
    name = "Sam";
    age = 21;
    team = "A"; 
  }
  
   public Player(String n, int a, String t) {
        name = n;
        age = a;
        team = t;
    }
   
   @Override
   public String toString() {
       return "Name: " + name + ", Age: " + age + ", Team: " + team;
   }
    
    
  
}


