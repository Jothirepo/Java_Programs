package com.topics;

public class Constructor_Types {

	public Constructor_Types(int i, String string) {	//parameterised constructor
		
		System.out.println("this is a parameterised constructor : " + i + string);
	}

	
	public Constructor_Types () {	//non-parameterised constructor
		
		System.out.println("this is a non-parameterised constructor");
	}
	
	
	public static void main(String[] args) {
		
		//two constructors can be invoked at same time or anyone can be invoked using one object syntax
		
		new Constructor_Types ();	//we don't need reference name to invoke constructor, we need new keyword to invoke it	
		Constructor_Types t = new Constructor_Types (12, "jo");
		
		System.out.println("both constructors can be invoked if we create separate objects");
	
	
		System.gc();
	}

}
