package com.ExceptionHandling;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		
		
		try {
			
			int a = 10;
			
			System.out.println(a/0);	
			
		   } 
		
		catch (Exception e) {

			System.out.println("below is the exception occurred while executing try block");

			System.out.println("printStackTrace helps us identify the type of exception and handle it");
			e.printStackTrace();
			
		}
		
		
		
	}

}
