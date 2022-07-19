package com.Constructor;

public class Constructor_Default {

	int a;
									//NO ARGUMENTS INSIDE () SO NO-ARGUMENT CONSTRUCTOR
	public Constructor_Default() {	//non-parameterised | no argument constructor
		
	}
	
	public Constructor_Default(String s) {	//parameterised constructor
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		Constructor_Default constructor_Default = new Constructor_Default();	//Initially only default constructor with no implementation has been invoked,
									//when we run we cannot see

		System.out.println(constructor_Default.a);		//Default constructor provides default value to no value string when called 

	}

}
