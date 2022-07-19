package com.StringManipulation;

public class String_int_change {

	public static String s = "1023";
	
	public static void main(String[] args) {
	
	//STRING TO INT
		
		//TYPE 1
		Integer valueOf2 = Integer.valueOf(s);
		System.out.println("string is converted to a no using valueOf method : " + valueOf2);
		
		System.out.println("*****************************************************************");
		
		//TYPE 2
		int parseInt = Integer.parseInt(s);
		System.out.println("string is converted to a no using parseInt method : " + parseInt);
		
		System.out.println("*****************************************************************");
		
		//convert integer into string
		String valueOf = String.valueOf(parseInt);
		System.out.println("number is converted to a String : " + valueOf);
		
		int indexOf = valueOf.indexOf("0");
		System.out.println("converted string is verified by indexOf method : " + indexOf);
				

	}

}
