package com.programs;

public class Remove_duplicates {

	public static void main(String[] args) {
		
		String s = "java_programming";
		
			StringBuilder sb = new StringBuilder();
			
			s.chars().distinct().forEach(c -> sb.append((char)c)); //use lambda expression
			
			System.out.println("remove duplicates using lambda expression : " + sb);

	}

}
