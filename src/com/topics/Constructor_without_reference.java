package com.topics;

public class Constructor_without_reference {

	public Constructor_without_reference() { // non-parameterised constructor

		System.out.println("this is a non-parameterised constructor");
	}

	public void dummy() {

		System.out.println("dummy method is called without reference name");
	}

	public void funny() {

		System.out.println("funny method is called without reference name");
	}

	public static void main(String[] args) {

		
		new Constructor_without_reference().dummy(); // we need reference name to invoke constructor once everytime a method is called in an object
													 //otherwise constructor will be called everytime we call a method
		System.out.println("********************************************************");
		
		new Constructor_without_reference().funny();	

		System.out.println("********************************************************");
		
	}

}
