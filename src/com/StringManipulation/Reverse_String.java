package com.StringManipulation;

public class Reverse_String {

	static String rev = "";
	
	public static void main(String[] args) {

		String s =  "jothi ramalingam";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			char charAt = s.charAt(i);
			
			rev = rev + charAt;
			
		}
		
		System.out.println(rev);
		
	}

}
