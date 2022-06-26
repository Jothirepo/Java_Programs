package com.programs;

import javax.management.StringValueExp;

public class Palindrome {

	public static void main(String[] args) {
		
		int a = 123212;
		
		StringBuilder sb = new StringBuilder(String.valueOf(a));
		
//		StringBuilder append = sb.append(a);	//1234
		
		StringBuilder reverse = sb.reverse();	//4321
		
		if ((sb==reverse)) {
			
			System.out.println("it's a palindrome");
			
		} else {

			System.out.println("it's not a palindrome");
		}
		
	}

}
