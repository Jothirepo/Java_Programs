package com.Constructor;

public class Pom_c {

	//runner class

	public static int age = 10;
	
	public static void main(String[] args) {
		
		Pom_p pc = new Pom_p(age);	//Pom_p is a parameterized constructor of another clas
		
		pc.demo();
		
		//we use this concept in Page Object Model - singleton design pattern

	}

}
