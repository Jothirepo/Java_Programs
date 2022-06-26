package com.programs;

public class Remove_characters {

	public static void main(String[] args) {
		
			String s = "jothi , from amazon";
			
			System.out.println("with char : " + s);

			String replace = s.replaceAll(",", "is");
			
			System.out.println("without char : " + replace);
	}

}
