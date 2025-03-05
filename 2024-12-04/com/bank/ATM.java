package com.bank;

public class ATM {
	
	
	protected double bal;
	
	
	public ATM(){
		
		bal = 15000.0;
		
	}
	
	public ATM(double b){
		
		bal = b;
		
		
	}
	
	/*@Override
	public String toString() {
		
		return "ATM No: "+bal+"\nName: "+name;
	}*/
	
    public String print() {
		
    	return "Balance: "+bal;
    }
    
    

}
