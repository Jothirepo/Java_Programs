package com.topics;

import java.util.LinkedList;
import java.util.List;

public class Remove_ret_add_all {

	public static void main(String[] args) {
		
List<Object> lili = new LinkedList<Object>();
		
		lili.add(4);
		lili.add("jothi");
		lili.add(2.5f);
		lili.add("_");
		lili.add("ram");
		System.out.println("LinkedList 1 : " + lili);
		
		System.out.println("*************************************************");
		
		List<Integer> li2 = new LinkedList<Integer>();
		
		li2.add(1);
		li2.add(3);
		li2.add(4);
		
		System.out.println("LinkedList 2 : " + li2);
		System.out.println("*************************************************");
		
		lili.addAll(li2);
		System.out.println("LinkedList 1 added with 2 : " + lili);
		System.out.println("*************************************************");
		
		lili.removeAll(li2);
		System.out.println("remove list 1's common elements with list 2 " + lili);
		System.out.println("*************************************************");
		
		lili.retainAll(li2);
		System.out.println("LinkedList of 1 retains common elements with list 2 : " + lili);
		System.out.println("*************************************************");
		
		
		lili.addAll(li2);
		System.out.println("common elements of list 1 is added with list 2 in addition to list 2 : " + lili);
		System.out.println("*************************************************");
		
		lili.remove(0);
		System.out.println("remove the element at the index 0 : " + lili);
		System.out.println("*************************************************");
		
		lili.add("hero");
		System.out.println(lili);
		System.out.println("*************************************************");
		 
		lili.removeAll(li2);
		System.out.println("remove common elements of list 2 in list 1 : " + lili);
		System.out.println("*************************************************");
		
		System.out.println("list 2 : " + li2);
		System.out.println("*************************************************");
		
		
		Object[] array = li2.toArray();
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}
		
		System.out.println("*************************************************");
		
		for (Object object : array) {
			
			System.out.println(object);
		}
		
		System.out.println("*************************************************");
		
		String string = li2.toString();
		
		System.out.println("list is converted to string " + string);
		
		

	}

}
