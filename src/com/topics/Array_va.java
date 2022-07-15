package com.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_va {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		System.out.println("length of an array : " + a.length);

		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println(max);
		
	
		List< Object> li = new ArrayList<Object> ();
		
		li.add(23);
		li.add("jothi");
		li.add(3.4f);
		li.add("_");
		li.add("ram");
		
		System.out.println("list created : " + li);
		System.out.println("****below is the array formed from list****");
		
		//convert list to array
		Object[] array = li.toArray();
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}

		
		//convert array to list
		List<Object> asList = Arrays.asList(array);
		
		System.out.println("****************************");
		System.out.println(asList);
		
		
		String string = li.toString();
		
		System.out.println(string);
		System.out.println(string.length());
		
		for (int i = 0; i < string.length(); i++) {
			
			System.out.println(string.charAt(i));
		}
		
		
		
	}

}
