package com.StringManipulation;

public class Stringg_Methods {

	static String s = "jothi rama lingam ";
	
	public static void main(String[] args) {
		
		//LENGTH
		int length = s.length();
		System.out.println(length);
		
		//find character by known index
		char charAt2 = s.charAt(3);
		System.out.println(charAt2);
		
		//find character of unknown index
		try {char charAt = s.charAt(23);
			System.out.println(charAt);} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutBoundException has been thrown for the index 23");
		}
		
		//find the index of a character by indexOf method
		int indexOf = s.indexOf("c", 0);
		System.out.println("First occurrence of c is " + indexOf);
		int lastIndexOf = s.lastIndexOf("c");
		System.out.println("last occurrence of c is " + lastIndexOf);
		int indexOf2 = s.indexOf('z');
		System.out.println("unknown character has been passed : " + indexOf2);
		int indexOf3 = s.indexOf("o", 4);
		System.out.println("Print the letter o from index 4 : " + indexOf3);
		System.out.println("***********************************************************************************************************************************");
		
		//iterate by character & reverse a string
		for (int i =  s.length()-1 ; i >= 0; i--) {	
			char charAt = s.charAt(i);
			System.out.println(charAt);
			}
		System.out.println("***********************************************************************************************************************************");
		
		//concatenation of 2 strings
		String sa = "jo";
		String ga = "23";
		String concat = sa.concat(ga);
		System.out.println(concat);
		System.out.println("***********************************************************************************************************************************");
		
		//check 2 strings
		boolean equals = sa.equals("jothi");
		System.out.println("whether is equal including case sensitivity : " + equals);		
		boolean equalsIgnoreCase = sa.equalsIgnoreCase("jo");
		System.out.println("whether is equal excluding case sensitivity : " + equalsIgnoreCase);
		System.out.println("***********************************************************************************************************************************");
		
		//Upper & Lower case
		String upperCase = s.toUpperCase();
		String lowerCase = s.toLowerCase();
		System.out.println("String converted to upper case : " + upperCase);
		System.out.println("String converted to upper case : " + lowerCase);
		System.out.println("***********************************************************************************************************************************");
		
		//string is immutable (literal)
		System.out.println("to prove string is immutable, even after using uppercase & lower case functions original remains the same : " + s);
		System.out.println("***********************************************************************************************************************************");
		
		//contains methods
		boolean contains = s.contains("a");	//LOWERCASE
		System.out.println("checking whether character 'a' is present or not : " + contains);
		boolean startsWith = s.startsWith("[a");
		System.out.println("checking whether the string starts with character 'k' or not : " + startsWith);
		boolean endsWith = s.endsWith("ho");
		System.out.println("checking whether the string starts with character 'ho' or not : " + endsWith);
		System.out.println("***********************************************************************************************************************************");
		
		//trim and save in new reference
		String trim = s.trim();
		System.out.println("remove spaces at the start & end of a string : " + trim);
		System.out.println("***********************************************************************************************************************************");
		//trim and save in old reference
		s = s.trim();
		System.out.println("MANIPULATE original string, by storing the output in string's original variable, do not take return type it will move the pointer to a new variable");
		System.out.println(s);
		
		
		//replace & concat strings
			String replace = s.replace('a', '*');
			System.out.println("replace a char in string : " + replace);
		//replace delimiter
				String sl = "welcome to string";
				String replace2 = sl.replace(" ", "-");
				System.out.println("Replacing a character/delimiter : " + replace2);
		//replace a word
				String replace3 = sl.replace("string", "collection");
				System.out.println(replace3);
		System.out.println("***********************************************************************************************************************************");
				
		String concat2 = s.concat(concat);
		System.out.println(concat2);
		System.out.println("***********************************************************************************************************************************");
		
		//substring_methods
		String substring = s.substring(4);
		System.out.println("Print string from the index we gave : " + substring);
		String substring2 = s.substring(3, 15);
		System.out.println("print from start index to index-1 : " + substring2);
		System.out.println("***********************************************************************************************************************************");

		//join using a delimiter
		String join = String.join("_", "king", "Queen", "Soldier");
		System.out.println("called using string class since it's a static method : " + join);		
		System.out.println("***********************************************************************************************************************************");
		
		String[] split = join.split("_");
		for (int i = 0; i < split.length; i++) {
			
			System.out.println(split[i]);
		}
		System.out.println("***********************************************************************************************************************************");
		
		for (String string : split) {
			
			System.out.println(string);
		}
		
		System.out.println("**********************split each and every character using for-each*********************************************");
		
		String[] split2 = join.split("");
		for (String string : split2) {
			
			System.out.println(string);
		}
			
		System.out.println("**********************split each and every character using charAt & for LOOP*********************************************");
		
		
		for (int i = 0; i < join.length(); i++) {
			char charAt = join.charAt(i);
			System.out.println(charAt);
		}
		
		
	}
	

}
