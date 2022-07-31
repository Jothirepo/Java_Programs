package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.management.StringValueExp;

public class Palindrome {

	public static void main(String[] args) {
		

		
		//reverse a string & it's palindrome
		String b = "tamilnadu";
		
		String pali = "";
		
		for (int i = b.length()-1; i >=0 ; i--) {

			char charAt = b.charAt(i);			
			pali = pali + charAt;
		}
		
		System.out.println("reverse of given string : " + pali);
		
		boolean equalsIgnoreCase = pali.equalsIgnoreCase(b);
		
		System.out.println("whether string and it's reverse are palindrome too : " + equalsIgnoreCase);
		
	}

}
