package com.programs;

public class String_Manipulation {

	public static void main(String[] args) {
		

		String rev = "jothiramalingam";
		
		System.out.println("************************************************************");
		
		int length = rev.length();
		System.out.println("Length of the string : " + length);
		
		int index = length -1;
		System.out.println(index);
		
		System.out.println("*****************************************************************************");
		
		
		
		char charAt = rev.charAt(2);
		
		String empt = "";
		
		String ne = empt + charAt;
		
		System.out.println(ne + " is got from extracting the char and setting it to an empty string");
				
		System.out.println(charAt + " is the character at the index 2");
				
		System.out.println("*****************************************************************************");
		
		
		
		//To print a string as individual letters line by line
		
		for (int i = 0; i < rev.length(); i++) {
			
			char charAt2 = rev.charAt(i);
			
			System.out.println("The character at the index position " + i + " is " + charAt2);
			
		}
		
		
		System.out.println("*****************************************************************************");
		
		
		//To print a string as individual letters line by line in reverse manner
		
		for (int i = rev.length()-1 ; i >= 0; i--) {
			
			System.out.println("The character at the index position " + i + " is " + rev.charAt(i));
			
		}
		
		System.out.println("*****************************************************************************");
		
		
	}
}
