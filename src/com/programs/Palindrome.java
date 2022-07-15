package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.management.StringValueExp;

public class Palindrome {

	public static void main(String[] args) {
		
		
		//palindrome on string
		String a = "jothi";
		
		System.out.println("Actual string : " + a);
		
		String rv = "";
		
		for (int i = a.length() - 1; i >=0; i--) {
			
			rv = rv + a.charAt(i);			
			
		}
		
		System.out.println("reverse of sting a : " + rv);
		
		boolean equalornot = rv.equalsIgnoreCase(a);
		
		System.out.println("whether string a and it's reverse alindrome : " + equalornot);
		
		
		
		//palindrome on numbers
		int in = 12131;
		
		
		
		
	}

}
