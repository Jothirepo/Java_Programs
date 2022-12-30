package com.topics;

import java.util.ArrayList;
import java.util.List;

public class Array_li {

	public static void main(String[] args) {
		
		List<Object> li = new ArrayList<Object> ();
		
		li.add("jothi");
		li.add(23);
		li.add("ram");
		li.add(2.5f);
		li.add(1, 26);
		li.add(1, "Rocky");
		
		
		System.out.println("ArrayList is been created with duplicates, integer, string, float, object with same index position : " + li);

		li.set(4, "Toofan");
		
		System.out.println("ArrayList's element at index 4 has been replaced : " + li);
		
		
	}

}
