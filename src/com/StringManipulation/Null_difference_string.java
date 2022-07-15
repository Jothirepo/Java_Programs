package com.StringManipulation;

public class Null_difference_string {

	public static void main(String[] args) {
	
		String s1 = "null";		//--> String
		String s2 = "";			//--> Empty string
		String s3 = " ";        //--> Space String
		String s4 = null;		//--> Null
		
		boolean empty = s1.isEmpty();
		System.out.println("s1 is empty or not : " + empty);
		boolean empty2 = s2.isEmpty();
		System.out.println("s2 is empty or not : " + empty2);		
		boolean empty3 = s3.isEmpty();
		System.out.println("s5 is empty or not : " + empty3);		
		boolean empty4 = s4.isEmpty();
		System.out.println("s3 is empty or not : " + empty4);
		
		
	}

}
