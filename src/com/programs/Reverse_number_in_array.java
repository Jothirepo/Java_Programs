package com.programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Reverse_number_in_array {

	public static <E> void main(String[] args) {

		Integer[] a = { 1, 2, 3, 4 };
		
		java.util.List<Integer> asList = Arrays.asList(a);
		
		
		System.out.println("ORIGINAL ARRAY : " + asList);
		
		Collections.reverse(asList);
		
		System.out.println("REVERSE ARRAY : " + asList);
		
		
	
	}

}
