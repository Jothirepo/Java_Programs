package com.Constructor;

public class A {

	// this keyword & constructor >> method invoke

	public A() {
		this("Jothi"); // navigate to string parameterized
		System.out.println("default constructor to non-parameterised constructor");
	}

	public A(int d) {
		this(2.5f); // navigate to float parameterized
		System.out.println(d);
	}

	public A(String s) {
		this(23); //// navigate to int parameterized
		System.out.println(s);
	}

	public A(float f) {
		System.out.println(f);
	}

	public void b() {
		System.out.println("*******************************************");
		System.out.println("this proves constructor gets invoked before methodss");
		System.out.println("current class method b"); // current class method 1
	}

	public void c() {
		System.out.println("current class method c"); // current class method 2
	}

	public static void main(String[] args) {

		A a = new A();

		a.b();
		a.c();

		System.out.println("**********************************************");

		System.out.println("order goes like 1st default constructor invokes non-parameterized constructor");
		System.out.println(
				"but within non-parameterised constructor, 'this' is invoked which points to string parameterized constructor");
		System.out.println("so it moves there, but within that 'this' is invoked which points to int parameterized");
		System.out.println("on int parameterized, 'this' points to float parameterized");
		System.out.println(
				"so now, float is executed first >> int >> string >> non-parameterized constructor invoked at last >> current class methods");

	}

}
