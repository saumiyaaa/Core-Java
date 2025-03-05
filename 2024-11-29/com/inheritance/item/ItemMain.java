package com.inheritance.item;

public class ItemMain {
	
public static void main(String[] args) {
        
        
        Item item1 = new Item();
        System.out.println(item1);
        System.out.println();
        
        Item item2 = new Item("Generic Item", "Generic Publisher", 2020, "123-4567891234", 19.99);
        System.out.println(item2);
        
        System.out.println("\n");
        
        
        Book book1 = new Book();
        System.out.println(book1);
        System.out.println();
        
        Book book2 = new Book("Java Programming", "Tech Books", 2021, "987-6543219876", 39.99, "John Doe", "1st Edition", 1);
        System.out.println(book2);
        
        System.out.println("\n");
        
        
        MusicCD musicCD1 = new MusicCD();
        System.out.println(musicCD1);
        System.out.println();
        
        MusicCD musicCD2 = new MusicCD("The Best Hits", "Music World", 2023, "321-6549873210", 14.99, "The Artist", 3);
        System.out.println(musicCD2);
        
        System.out.println("\n");
        
        
        Software software1 = new Software();
        System.out.println(software1);
        System.out.println();
        
        Software software2 = new Software("Windows 10", "Microsoft", 2015, "456-1237894560", 129.99, "10.0");
        System.out.println(software2);
    }

}
