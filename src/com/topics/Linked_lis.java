package com.topics;

import java.util.LinkedList;
import java.util.List;

public class Linked_lis {

	public static void main(String[] args) {
		
		List<Object> lili = new LinkedList<Object>();
		
		lili.add(20);
		lili.add("jothi");
		lili.add(2.5f);
		lili.add("_");
		lili.add("ram");
		System.out.println("LinkedList initially : " + lili);
		System.out.println("*********************************************************************");
		
		int size = lili.size();
		System.out.println("LinkedList sizes initially : " +size);
		System.out.println("*********************************************************************");
		
		
		Object object = lili.get(3);
		System.out.println("Get the value at index 3 : " +object);
		System.out.println("*********************************************************************");
		
		Object set = lili.set(1, "ilakiya");
		System.out.println("If we take return type for set, only the old value will be returned " + set);
		System.out.println("LinkedList finally after set/replace operation is : " +lili);
		System.out.println("*********************************************************************");

		
		boolean empty = lili.isEmpty();
		System.out.println("whether linkedlist is empty : " + empty);
		System.out.println("*********************************************************************");

		for (int i = 0; i < lili.size(); i++) {
			
			System.out.println(lili.get(i));
		}
		
		System.out.println("*********************************************************************");

		for (Object object2 : lili) {
			
			System.out.println(object2);
		}
		
		System.out.println("*********************************************************************");
		lili.clear();
		System.out.println("LinkedList after clearing the list : " + lili);
	}

}
