package com.topics;

public class Constructor_with_reference {

	public Constructor_with_reference() { // non-parameterised constructor

		System.out.println("this is a non-parameterised constructor");
	}

	public void dummy() {

		System.out.println("dummy method is called with reference name");
	}

	public void funny() {

		System.out.println("funny method is called with reference name");
	}

	public static void main(String[] args) {

		Constructor_with_reference c = new Constructor_with_reference(); // we need reference name to invoke constructor
																			// once everytime a method is called in an
																			// object
		// otherwise constructor will be called everytime we call a method

		c.dummy();
		c.funny();

		System.out.println(
				"since constructor is invoked using new & stored in ref name, it is called once only but multiple methods called using the same reference name");

	}
}
