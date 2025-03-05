package com.exceptions.login;

public class Login {
	
	private String username;
	private String password;
	
	public Login() {
		
		username = "saumiyaaa";
		password = "Sam@1234";
	}
	
	/*public Login(String username, String password) {
		
		this.username = username;
		this.password = password;
	}*/
	
	public void checkCredentials(String un, String pass)throws InvalidCredentialsError{
		
		if(!username.equals(un) )
			throw new InvalidCredentialsError("Login Failed ! Enter correct username ");
		if(!password.equals(pass))
			throw new InvalidCredentialsError("Login Failed ! Enter correct password ");
		
		System.out.println("\nLogin Successful !!!");
	}

}
