package com.StringManipulation;

public class String_Buffer {

	public static void main(String[] args) {

		// String duplication holds same location
		String s = "jo12thi#rama$lingam";
		String n = "jo12thi#rama$lingam";

		System.out.println("************************DUPLICATES SHARE THE LOCATION on STRING*********");
		System.out.println("Memory Location of the given String s : " + System.identityHashCode(s));
		System.out.println("Memory Location of the given String n : " + System.identityHashCode(n));
		String concat = s.concat(n);
		System.out.println("Memory Location after concatenation : " + System.identityHashCode(concat));
		
	
		System.out.println("************************Duplicates created with new memory on Buffer & Builder**********************************");
		StringBuffer sb = new StringBuffer("JAVA");		//Non-Literal
		StringBuffer ss = new StringBuffer("JAVA");		//Created with object
		
		System.out.println("Memory Location of the given StringBuffer sb : " + System.identityHashCode(sb));
		System.out.println("Memory Location of the given StringBuffer ss : " + System.identityHashCode(ss));
	
		System.out.println("******************************************************************************************");
		StringBuffer append = ss.append(sb);
		System.out.println("Memory Location after append : " + System.identityHashCode(append));
		
		String b = "jo1 2t hi# ram a$lin ga m";
		System.out.println("length of the given string b : " + b.length());
		int lastIndexOf = b.lastIndexOf("a");
		System.out.println("lastindex of a : " + lastIndexOf);
		System.out.println("*************************************************************************************");
	
		String[] split = b.split(" ");
		for (String string : split) {
			
			System.out.println(string);
			
		}
		System.out.println("*************************************************************************************");
		System.out.println("Length after splitting : " + split.length);
		
		
		
	}

}
