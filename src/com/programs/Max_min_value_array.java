package com.programs;

public class Max_min_value_array {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		
		int max = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i]>max) {
				
				max = a[i];
			}
		}

		System.out.println("max value in an array : " + max);
		
		int min = a[0];
		
		for (int i = a.length-1; i >=0 ; i--) {
			
			if (a[i]<min) {
				
				min = a[i];
			}
		}
		
		
		System.out.println("min value in an array : " + min);
	
		int mini = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]<mini) {
				
				mini = a[i];
				
			}
		}
	
	
		System.out.println("mini value of an array : " + mini);
	
	}
	
	
		

}
