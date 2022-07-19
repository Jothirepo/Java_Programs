package com.ExceptionHandling;

public class Class_Cast_Exception {

	public static void main(String[] args) {
		
		long l = 12114;
		
		int i = (int) l;		//It is asking to cast
						//Delete the cast & check the exception
		
		System.out.println(i);
		

	}

}
