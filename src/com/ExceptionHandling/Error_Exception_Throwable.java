package com.ExceptionHandling;

public class Error_Exception_Throwable {

	public static void main(String[] args) {

		try {
			
			int a = 10/0;
			System.out.println(a);
		} 
		
		catch (Error e) {			//error is a child class

		System.out.println("this is an error");
		
		}
		catch (Exception e) {		//Exception is a child class

		System.out.println("this is an exception");
		e.printStackTrace();
		
		}
		catch (Throwable e) {		//Throwable is the parent
			
			System.out.println("PARENT OF EXCEPTIONS & ERRORS");
		}
		
		
	}

}
