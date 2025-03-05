package com.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFile {

	public static void main(String[] args) throws IOException{

		Properties p = new Properties();
		
		FileInputStream fi = new FileInputStream("info.properties");
		p.load(fi);
		
		String s1 = p.getProperty("user");
		System.out.println(s1);
		
		String s2 = p.getProperty("password");
		System.out.println(s2);
		
		String s3 = p.getProperty("mybook");
		System.out.println(s3);

	}

}