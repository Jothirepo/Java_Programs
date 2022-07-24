package com.programs;

public class Remove_duplicates {

	public static void main(String[] args) {
		
		String s = "java_programming";
		
			StringBuilder sb = new StringBuilder();
			
			s.chars().distinct().forEach(c -> sb.append((char)c)); //use lambda expression
			
			System.out.println("remove duplicates using lambda expression : " + sb);
			
			
			
			//remove duplicate with value
			String b = "java_programing";
			
			StringBuffer ss = new StringBuffer();
			
			for (int i = 0; i < b.length(); i++) {
				
				if (b.contains("a")) {
					
					String replace = b.replace("a", " ");
					System.out.println(replace);
					break;
				}
				
			}
			
			
			//remove duplicates
			b.chars().distinct().forEach(c -> ss.append((char)c));
			
			System.out.println(sb);

	}

}
