package com.interfaces.bankingsystem;

public class BankAccount {
	
		
		protected int accNo;
		protected String name;
		
		public BankAccount(){
			
			accNo = 12345;
			name = "Michael";
		}
		
		public BankAccount(int no, String n){
			
			accNo = no;
			name = n;
			
		}
		
		/*@Override
		public String toString() {
			
			return "Account No: "+accNo+"\nName: "+name;
		}*/
		
	    public String print() {
			
	    	return "Account No: "+accNo+"\nName: "+name;
	    }
	    
	    
	    
	}


