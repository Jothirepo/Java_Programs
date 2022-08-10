package com.topics;

public class Static_Vs_Main_method {

	public static String s;

	public void normalmethod() {

		System.out.println(s);
		System.out.println("normal method is called after static & main method respectively");
		
	}
	public static void main(String[] args) {

		s = "ram"; //since main method is the entry point of execution, this value gets allocated to normal method	
		Static_Vs_Main_method m = new Static_Vs_Main_method();
		m.normalmethod();
		
	}

}
