package com.ExceptionHandling;

public class Compile_Runtime_Exception {

	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(2000); 		//Interrupted (Compile time exception occurs)
									//which is handled by throws keyword
		
		System.out.println("a");
		
		try {
			
			Thread.sleep(1000);		//Compile time exception doesn't pop up here
									//Since try-catch block is for handling runtime exceptions
			System.out.println("b");
			
		} catch (Exception e) {

			System.out.println("c");
		}
	
	
	
	}

}
