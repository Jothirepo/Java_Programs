package com.programs;

public class Factorial {

	public static int factorial = 1;

	public static void main(String[] args) {

		for (int i = 10; i >= 1; i--) {
			
			factorial = factorial * i;
		}
		
		System.out.println("Factorial of 5 is : " + factorial);
	}

}
