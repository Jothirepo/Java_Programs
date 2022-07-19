package com.ExceptionHandling;

public class NullPointer_Exception {

	public static void main(String[] args) {

		String s = null;

		int length = s.length();
		System.out.println(length);

	}

}
