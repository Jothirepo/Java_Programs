package com.topics;

public class Equals_Double_Equals {

	public static void main(String[] args) {

		//==Equals checks memory reference (mostly for primitive datatypes)
		
		int a = 10;		//stored in stack memory 
//		int b = 10;
		
		if (a==10) {
			
			System.out.println("equals");
			
		} else {

			System.out.println("not equals");
		}
		
	}

}
