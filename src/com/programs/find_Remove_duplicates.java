package com.programs;

import java.util.stream.IntStream;

public class find_Remove_duplicates {

	public static void main(String[] args) {

		// find duplicates
		String si = "programming";

		int length = si.length();

		char[] charArray = si.toCharArray();

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (charArray[i] == charArray[j]) {

					System.out.print(charArray[j]);
					break;
				}

			}
		}

		System.out.println("*****************************************************");

		//remove duplicates
		String s = "java_programming";
		StringBuilder sb = new StringBuilder();

		s.chars().distinct().forEach(c -> sb.append((char) c)); // use lambda expression

		System.out.println("remove duplicates using lambda expression : " + sb);

		System.out.println("*****************************************************");

		
		
		// remove duplicate with value
		String b = "java_programing";

		StringBuffer ss = new StringBuffer();

		for (int i = 0; i < b.length(); i++) {

			if (b.contains("a")) {

				String replace = b.replace("a", " ");
				System.out.println(replace);
				break;
			}

		}

	}

}
