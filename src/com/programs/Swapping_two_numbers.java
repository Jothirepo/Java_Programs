package com.programs;

public class Swapping_two_numbers {

	private void beforeswap() {
		int a = 10, b = 20;

		System.out.println("BEFORE SWAPPING : " + "a = " + a + ", " + "b = " + b);

	}

	// 1_TYPE
	private void TYPEONE() {

		int a = 10, b = 20;

		int x = a;
		a = b;
		b = x;

		System.out.println("AFTER SWAPPING using variable name: " + "a = " + a + ", " + "b = " + b);

	}

	// 2_TYPE
	private void TYPETWO() {

		int a = 10, b = 20;

		a = a + b; // 10 + 20
		b = a - b; // 30 - 20
		a = a - b; // 30 - 10

		System.out.println("AFTER SWAPPING using ADDITION & SUBTRACTION : " + "a = " + a + ", " + "b = " + b);

	}
	
	//3_TYPE
	private void TYPETHREE() {
		
		//HERE a & b VALUE SHOULD NOT BE ZERO
		int a = 10 , b = 20;
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("AFTER SWAPPING using MULTIPLICATION & DIVISION : " + "a = " + a + ", " + "b = " + b);


	}

	public static void main(String[] args) {

		Swapping_two_numbers SN = new Swapping_two_numbers();

		SN.beforeswap();
		SN.TYPEONE();
		SN.TYPETWO();
		SN.TYPETHREE();
	}

}
