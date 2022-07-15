package com.topics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLi {

	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<Integer> ();
		li.add(1);	//comes from upcasting (list method - parent methods)
		
		LinkedList<Object> linkedlist = new LinkedList<Object>();
		linkedlist.addFirst("jo"); //comes from child class object (linkedlist's own method)
		
		
		
		List<Object> arr = new ArrayList<Object> ();
		arr.add("jot");	//can add using list interface
		
		ArrayList<Object> aa = new ArrayList<Object>();
		aa.add("JOthi"); //only have add method from list no addfirst or addlast like Linkedlists
		

	}

}
