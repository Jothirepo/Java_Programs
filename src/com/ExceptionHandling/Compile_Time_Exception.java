package com.ExceptionHandling;

public class Compile_Time_Exception {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("abc");
		
		Thread.sleep(3000);
		
		System.out.println("This happened after we handled thread sleep by InterruptedException at CompileTime using Throws");
		
	}
}
