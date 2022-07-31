package com.programs;

public class Largest_And_Second_Largest_No {

	public static void main(String[] args) {

		int a[] = { 10, 30, 50, 60, 100, 25, 55, 68, 85, 44, 37 };

		int largestnumber = a[0];
		int secondlargestno = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largestnumber) {

				largestnumber = a[i];

			}
		}

		System.out.println("largestnumber : " + largestnumber);

		for (int i = 0; i < a.length; i++) {

			if (a[i] > secondlargestno && a[i] != largestnumber) {

				secondlargestno = a[i];
			}

		}

		System.out.println("secondlargestno : " + secondlargestno);

	}

}
