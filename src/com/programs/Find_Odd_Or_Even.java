package com.programs;

import java.util.Scanner;

public class Find_Odd_Or_Even {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int ip = sc.nextInt();  //to take input from user/console 
		
		System.out.println("Input number : " + ip);
		
		
		//Type_1
		
		int c = ip%2;			// the symbol % is to know what the reminder is if we divide a number
								// the symbol / is to know what the quotient is if we divide a number
		
		if (c==0) {				//A number is even if it's reminder is zero
			
			System.out.println("It is an even number from type 1");
			
		} else {

			System.out.println("It is an odd number from type 1");
			
		}
		
		
		//Type_2
		
		int d =ip%2;
		
		if (d!=0) {
			
			System.out.println("It is an odd number from type 2");
			
		} else {

			System.out.println("It is an even number from type 2");
			
		}
		
		
	}
}
