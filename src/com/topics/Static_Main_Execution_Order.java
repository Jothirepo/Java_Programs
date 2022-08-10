package com.topics;

public class Static_Main_Execution_Order {

	public static String s = "static variable";
	
	public static void staticmethod() {

		System.out.println("static method");
	}
	
	static {
		
		System.out.println("static block");
	}
	
	public void normalmethod() {

		System.out.println("normal method");
	}
	public static void main(String[] args) {
		
		System.out.println(s);
		staticmethod();
		
		
		Static_Main_Execution_Order sm = new Static_Main_Execution_Order();
		
		sm.normalmethod();
		
		System.out.println("main method");
		
		
		
		
		
	}

}
