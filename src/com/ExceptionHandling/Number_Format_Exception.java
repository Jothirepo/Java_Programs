package com.ExceptionHandling;

public class Number_Format_Exception {

	public static void main(String[] args) {

		String s = "23"; 					// Literal String (Immutable String)
		System.out.println(s + 10); 		// Concatenation

		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt + 10);  // Additional operator

		String d = "2s"; // Character is present which is not int, so exception will be thrown at runtime

		try {
			
			int parseInt2 = Integer.parseInt(d);

		} catch (NumberFormatException e) {
			
			System.out.println(
					"NumberFormatException occurred here since there is an aphabet in the String which cannot be converted to int");
		}

		String replaceAll = d.replaceAll("[^0-9]", "");
		System.out.println("alphabet removed string using replaceAll method with [^0-9] : " + replaceAll);

		int parseInt3 = Integer.parseInt(replaceAll);
		System.out.println("String converted to int : " + parseInt3);
		
		int i = 5913;
		
		//convert integer into string
		String valueOf = String.valueOf(i);
		System.out.println("number is converted to a String : " + valueOf);
		
		int indexOf = valueOf.indexOf("9");
		System.out.println("converted string is verified by indexOf method : " + indexOf);
				

	}

}
