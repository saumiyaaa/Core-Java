package com.inheritance.player;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1 = new Player();
        System.out.println(p1);
        System.out.println();
		Player p2 = new Player("John Doe", 30, "Team A");
        System.out.println(p2);
        
        System.out.println("\n");
        
        HockeyPlayer hockeyPlayer1 = new HockeyPlayer();
        System.out.println(hockeyPlayer1);
        System.out.println();
        HockeyPlayer hockeyPlayer2 = new HockeyPlayer("Alex Winter", 28, "Team X", "Forward");
        System.out.println(hockeyPlayer2);
        
        System.out.println("\n");
        
        FootballPlayer footballPlayer1 = new FootballPlayer();
        System.out.println(footballPlayer1);
        System.out.println();
        FootballPlayer footballPlayer2 = new FootballPlayer("Chris Bolt", 25, "Team Y", "Midfielder");
        System.out.println(footballPlayer2);
        
        System.out.println("\n");
        
        Batsman batsman1 = new Batsman();
        System.out.println(batsman1);
        System.out.println();
        Batsman batsman2 = new Batsman("Sachin Tendulkar", 50, "India", 18000, 100);
        System.out.println(batsman2);
        
        System.out.println("\n");
        
        Bowler bowler1 = new Bowler();
        System.out.println(bowler1);
        System.out.println();
        Bowler bowler2 = new Bowler("Shane Warne", 52, "Australia", 700, 25.4);
        System.out.println(bowler2);
        

        
        
        
        
        
        

	}

}
