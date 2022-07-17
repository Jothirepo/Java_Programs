package com.Constructor;

public class Super_C extends Super_P{

	public Super_C() {
		
		
		super(20);		//if we didn't pass parameter or explicitly create super with parameters, it would have invoked non-parameterised constructor of parent class
		System.out.println("non-parameterised constructor of child class");
		
	}
	
	public static void main(String[] args) {
		
		Super_C child = new Super_C();
	}
	
}
