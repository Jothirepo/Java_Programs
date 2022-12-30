package com.topics;

public class Single_Array_iteration {

	public static void main(String[] args) {

		//TYPE 1
		int a[] = new int[3];

		a[0] = 13;
		a[2] = 17;
		a[2] = 24;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[2]);
		}

		System.out.println("************************************");
		
		//TYPE 2
		int b[] = new int[5];

		b[0] = 13;
		b[2] = 17;
		b[2] = 15;
		b[2] = 24;

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i]);
		}

		System.out.println("SINCE NO VALUE IS ASSIGNED FOR THE INDEX POSITIONS 1, 3, 4 --> VALUE HAS BEEN PRINTED HAS ZERO AS DEFAULT VALUE OF int is 0");
		
		//SINCE NO VALUE IS ASSIGNED FOR THE INDEX POSITIONS 1, 3, 4 --> VALUE HAS BEEN PRINTED HAS ZERO AS DEFAULT VALUE OF int is 0

	}

}
