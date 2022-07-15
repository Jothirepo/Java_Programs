package com.programs;

public class Reverse_number {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("input your name & number respectively");
		
		String nextLine = sc.nextLine();
		int number = sc.nextInt();
		

		System.out.println("INPUT NUMBER : " + number);
		System.out.println("INPUT STRING : " + nextLine);

		// 1_TYPE_bygivinginput

		StringBuffer sb = new StringBuffer(String.valueOf(number));
		sb.reverse();

		System.out.println("REVERSE NUMBER using valueof method : " + sb);

		System.out.println("*************************************************************");
		
		// 2_TYPE_bygivennumber

		int a = 4567;
		System.out.println("INPUT NUMBER : " + a);

		StringBuilder sbi = new StringBuilder();

		sbi.append(a);
		sbi.reverse();

		System.out.println("REVERSE NUMBER using append & reverse : " + sbi);
		
		
	}
	
	
}
