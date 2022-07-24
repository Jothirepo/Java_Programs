package com.topics;

import java.util.*;

public class Retain_All {

	public static void main(String[] args) {

		List<Object> li = new ArrayList<Object>();

		li.add("ila");
		li.add(23);
		li.add("jo");
		li.add("ram");
		li.add(null);
		li.add("ila");
		li.add(null);

		System.out.println("ArrayList with duplicate Strings & duplicate null values and int : " + li);

		System.out.println("Before ArrayList methods manipulation : " + li);
		
		System.out.println("*****************************************************");
		
		List<Object> kk = new LinkedList<Object>();

		kk.add(25);
		kk.add(23);
		kk.add("jo");
		kk.add("ila");
		kk.add(null);
		kk.add(23.5f);
		kk.add(null);

		System.out.println("LinkedList with duplicate Strings & duplicate null values and int : " + kk);
		
		System.out.println("*****************************************************");
		
		kk.retainAll(li);
		System.out.println("retainAll on Linkedlist kk from lists li & kk : " + kk);
		
		System.out.println("*****************************************************");
		
		li.removeAll(kk);
		System.out.println("Remove the common elements of ArrayList li from li & kk : " + li);
		
		System.out.println("*****************************************************");
		
		System.out.println("Since list is hierarchial (mutable), values will be manipulated");
		System.out.println("After ArrayList methods manipulation : " + li);
		System.out.println("After LinkedList methods manipulation : " + kk);
		
		
	}

}
