package com.programs;

public class Skip_Numbers {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		for (int i = 0; i <= a.length; i++) {
			
			if (i==3 || i ==13) {
				
				continue;
				
			}
			
			System.out.println(i);
		}
	}

}
