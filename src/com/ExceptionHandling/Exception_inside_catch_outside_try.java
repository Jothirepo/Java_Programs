package com.ExceptionHandling;

public class Exception_inside_catch_outside_try {

	public static void main(String[] args) {

		// int a = 10/0;
		// System.out.println(a); exception outside try-catch will not be handdled
		
		try {

			int b = 10 / 0;
			System.out.println(b); // arithmetic exception occurs here

		} 
		
		catch (Exception e) {

			System.out.println("arithmetic exception handled");

			String s = null;    	// NullPointer exception will be thrown
									// catch block will handle exceptions only in try block
									// not even inside it's own block

			System.out.println(s.trim());
		}

	}

}
