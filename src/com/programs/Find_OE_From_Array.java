package com.programs;

public class Find_OE_From_Array {

	public static void main(String[] args) {

		
		int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i : a) {
			
			if (i%2==0) {
				
				System.out.println(i + " is an even number");
				System.out.println("***************************************");
				
			} else {

				System.out.println(i + " is an odd number");
				System.out.println("***************************************");
				
			}
		}
		
}
}