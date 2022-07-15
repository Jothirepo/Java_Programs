package com.StringManipulation;

public class Convert_String_to_int {

	
	public static String s = "1023";
	
	
	public static void main(String[] args) {
	
		//convert string into integer
		int parseInt = Integer.parseInt(s);
		System.out.println("string is converted to a number : " + parseInt);
		
		
		//convert integer into string
		String valueOf = String.valueOf(parseInt);
		System.out.println("number is converted to a String : " + valueOf);
		
		
		
		

	}

}
