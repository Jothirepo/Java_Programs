package com.topics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Types {

	public static void main(String[] args) {
		
		Set<Object> s = new HashSet<Object>();	//Upcasting
		
		s.add(2);
		s.add("jo");
		s.add(null);
		s.add(2);
		
		System.out.println("HastSet doesn't allow duplicate normal values & duplicate null values & printed in random order " + s );
		
		System.out.println("************************************************************************************");
		
		Set<Object> lh = new LinkedHashSet<Object>();
		
		lh.add("jothi");
		lh.add(2);
		lh.add(24.5f);
		lh.add(null);
		
		System.out.println("LinkedHashSet printed in insertion order : " + lh);
	
		System.out.println("************************************************************************************");
		
		Set<Object> ts = new TreeSet<Object>();
		
		ts.add(123);
		ts.add(2);
		ts.add(10);
		ts.add(3);
		
		System.out.println("TreeSet printed in ascending order : " + ts);
		
		System.out.println("************************************************************************************");
		
		System.out.println("TreeSet won't allow null values & heterogenous objects");
	
	}

}
