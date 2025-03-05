package com.abc.college;

import java.util.ArrayList;


public class Library {
	
	private ArrayList<Book> booklist = new ArrayList<>();
	
	public Library() {
		
		 booklist.add(new Book(674, "Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
	     booklist.add(new Book(665, "Harry Potter and the Goblet of Fire", "J.K. Rowling"));
	     booklist.add(new Book(976, "Harry Potter and the Order of Phoenix", "J.K. Rowling"));
	     booklist.add(new Book(123, "Fourth Wing", "Rebecca Yarros"));
	     booklist.add(new Book(125, "Kingdom of Ash", "Sarah J Maas"));
	     booklist.add(new Book(123, "Throne of Glass", "Sarah J Maas"));
	     booklist.add(new Book(868, "Inferno", "Dan Brown"));
	     booklist.add(new Book(217, "Assassin's Blade", "Sarah J Maas"));
	     booklist.add(new Book(234, "Da Vinci Code", "Dan Brown"));
		
	}
	
	
	public void add(Book bobj) {		
		
		booklist.add(bobj);
		System.out.println(booklist);
	}
	
	public boolean isEmpty() {
		
		return booklist.isEmpty();		
	}
	
	public ArrayList<Book> viewAllBooks(){
		
		return booklist;
		
	}
	
    public ArrayList<Book> viewBooksByAuthor(String author){
		
	ArrayList<Book> booksByAuthor = new ArrayList<>();
	boolean flag = false;
	for(Book book: booklist) {
		if (book.getAuthor().trim().equalsIgnoreCase(author.trim())) {
			booksByAuthor.add(book);	
			flag = true;
		}		
	}
	if (!flag) {
        System.out.println("List is Empty");     
    } 
	return booksByAuthor;
		
	}
	
	public int countBooks(String bname) {
		int count = 0;
		for(Book book : booklist) {
			if(book.getBookName().equalsIgnoreCase(bname)) {
				count++;
			}
		}
		return count;
		
	}    

}
