package com.programs;

public class Remove_spl_characters {

	public static void main(String[] args) {
		
		//Remove characters we need to
		String s = "jo12thi#rama$lingam";
		String n = "jo12thi#rama$lingam";
		
		System.out.println("**********DUPLICATES SHARE THE LOCATION*********");
		System.out.println("Memory Location of the given String s : " + System.identityHashCode(s));
		System.out.println("Memory Location of the given String n : " + System.identityHashCode(n));
		
		System.out.println("*************************************************************************************");
		String replaceAll = s.replaceAll("[^a-zA-Z0-9]","");
							//Instructing java to ignore (^) the small letters, capital letters & numbers in the given string
							//and replace them with an empty string & print the rest under the same reference name
	
		System.out.println("Remove special characters : " + replaceAll);
		
		String replaceAll2 = s.replaceAll("[^a-zA-Z]", "");
		System.out.println("Remove special characters & NUMBERS : " + replaceAll2);
		
		String replaceAll3 = s.replaceAll("[^A-Z]", "");
		System.out.println("Remove everything except capital letters : " + replaceAll3);
		
		String replaceAll4 = s.replaceAll("[^a-z]", "");
		System.out.println("Remove everything except small letters : " + replaceAll4);
		
		System.out.println("*************************************************************************************");
		
	}	
}
