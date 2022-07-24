package com.programs;

public class Remove_characters {

	public static void main(String[] args) {
		
			String s = "jothi,fr%om&maz#on";
			
			String replaceAll = s.replaceAll("[^a-zA-Z0-9]", "");
			
			System.out.println("replace all special characters : " + replaceAll);
	}

}
