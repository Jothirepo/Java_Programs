package com.programs;

public class Repetitive_words {

	public static void main(String[] args) {
		
		String s = "rama joth rama jothi";
		
		String[] allwords = s.split(" ");
		
		String repetitiveword = allwords[0];
		
		for (int i = 0; i < allwords.length; i++) {
			
			if (allwords[i]==repetitiveword); {
				
				repetitiveword = allwords[i];
				
			}
			
		}
		System.out.println("Most repetitive word : " + repetitiveword);
		
	}

}
