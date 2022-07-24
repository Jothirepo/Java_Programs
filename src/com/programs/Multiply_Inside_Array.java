package com.programs;

public class Multiply_Inside_Array {

	public static int multi =1;
	
	public static void main(String[] args) {
		
		//Multiply the value inside an array
		
				int a[] = { 1, 2, 3, 4, 5, 6 };

				for (int i : a) {

					if (i <= 6) {

						multi = multi * i;

					} 
				}

				System.out.println("Multiplication of values inside an array : " + multi);

				
				

	}

}
