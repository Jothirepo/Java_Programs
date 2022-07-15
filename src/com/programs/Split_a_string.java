package com.programs;

public class Split_a_string {

	public static void main(String[] args) {

		// join using a delimiter
		String join = String.join("_", "king", "Queen", "Soldier");
		System.out.println("called using string class since it's a static method : " + join);
		
		
		System.out.println("******************split word by word using split('_') & for loop**********************************************");

		//split word by word using for loop
		String[] split = join.split("_");
		for (int i = 0; i < split.length; i++) {

			System.out.println(split[i]);
		}
		
		System.out.println("*******************split word by word using for-each loop*****************************************");

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
