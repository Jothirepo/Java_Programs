package com.programs;

public class Find_OE_Value_Together {

	public static int oddsum = 0, evensum = 0;

	public static void main(String[] args) {

		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i : a) {

			if (i % 2 == 0) {

				evensum = evensum + i;		//previously value gets overrided by new value

			}

			else {

				oddsum = oddsum + i;

			}

		}

		System.out.println(evensum);
		System.out.println(oddsum);

	}

}

/*
 
 Process :

	> Array value a is assigned
	> To check a value to be odd or even and move on to next value we need to iterate, so for each is used.
	> To check whether that specific value is odd or even we need to check it's condition using if-else
	> Inorder to collect all values we need a static variable, as assigning a variable inside method will become local
		and so, new value will not get added as local variable cannot transfer it's value outside the method.
	> So we declare 2 static variables for oddsum and evensum to collectively add odd and even values respectively
	> When a specific condition is met, suppose 2 is an even number when condition is met, it will go inside the block to execute the statement,
		We can use static variable evensum, so that 2 will be assigned to it by adding the i value got to it
		When again even condition is met, it's value will go inside the block and get assigned.
	> Now to collect those values, we need to print the static evensum variable again outside the for each loop, 
		So that everytime a value gets assigned inside the block of a specific condition,
			Evensum outside the loop will store it
			
*/





