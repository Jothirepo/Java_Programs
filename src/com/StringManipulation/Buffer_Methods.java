package com.StringManipulation;

public class Buffer_Methods {

	public static void main(String[] args) {
		
		StringBuffer s  = new StringBuffer("jothi ramalingam");
		
		System.out.println(s);
		int length = s.length();
		System.out.println(length);
		
		System.out.println("Append method : "  + s.append("ilakiya"));
		System.out.println("Insert method : "  + s.insert(16, " "));
		System.out.println("replace method : " + s.replace(0, 3, "Jot"));
		System.out.println("delete method : "  + s.delete(0, 6));
		System.out.println(s.reverse());
	}
}
