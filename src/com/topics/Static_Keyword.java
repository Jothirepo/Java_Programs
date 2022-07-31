package com.topics;

public class Static_Keyword {

	public static char c;
	public static String s;
	
	public static void jo() {

		System.out.println("jothi");
	}
	
	private void ram() {

		System.out.println("this is ram");
	}
	
public static void main(String[] args) {
	
	Static_Keyword ss = new Static_Keyword ();
	ss.ram();
	
	System.out.println(s);
	System.out.println(c);
	
	Static_Keyword.jo();
}

}
