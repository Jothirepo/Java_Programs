package com.Constructor;

public class Child_Constructor extends Parent_Constructor {

	public Child_Constructor() {
		
		//super();
		System.out.println("this is child constructor");
		
		//while doing extends super(); gets invoked by default before child constructor, which
		//inturn does everything the parent constructor has to offer and then moves to child constructor
		//this is called constructor chaining
	}
	
	public void childone() {
		
		System.out.println("child one method");

	}
	
	public void childtwo() {
		
		System.out.println("child two method");

	}
	
	public static void main(String[] args) {
		
		
		new Child_Constructor().memo();
		new Child_Constructor().childone();
		new Child_Constructor().childtwo();
	}

}
