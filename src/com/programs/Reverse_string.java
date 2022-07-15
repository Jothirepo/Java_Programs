package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		
		
		Scanner j = new Scanner(System.in);
		String nextLine = j.nextLine();
		
		System.out.println("STRING INPUT WE GAVE : " + nextLine);
		
		//Reverse using scanner class
		
		String rv = new String (nextLine);
		StringBuilder SC = new StringBuilder();
		SC.append(rv);
		SC.reverse();
		System.out.println("Reversed using the input from scanner class input : " + SC);
		
		System.out.println("************************************************************");

		
		
		String rev = "jothi";
		
		//1st way_using_reverse function_with_existing input
		
		StringBuilder SB = new StringBuilder();
		
		SB.append(rev);
		SB.reverse();
		
		System.out.println("Reverse a string using string builder : " + SB);
		System.out.println("************************************************************");
		
		
		
		
		//2nd way_using for & charAt loop
		
		String ss = "jothiramalingam";
		
		String revers ="";
		
		for (int i = ss.length()-1; i >=0; i--) {		//since we need to reverse, we are reversing the syntax
							
		revers = revers + ss.charAt(i);
		
		}
				
		System.out.println("Reverse a string using charAt function : " + revers);
		
		System.out.println("************************************************************");
		
					
		
		//3rd way_using charArray
		
		String name = "jothrama";
		
		char[] charArray = name.toCharArray();			//convert string to character array.
		
		String reve ="";
		
		for (int i = charArray.length-1; i>=0; i--) {
			
			reve = reve+charArray[i];
			
		}
		
		System.out.println("Reverse a string using charArray logic : " + reve);
		
		System.out.println("************************************************************");
		
		System.out.println("Below is reversed using collections class");
		
	
		
		
		
		//4th_way_using_collections
		
		String s = "rama";
		
		char[] charArray2 = s.toCharArray();
		
		
		List<Character> list = new ArrayList<Character>();
		
		for (Character character : charArray2) {
			
			list.add(character);
		}
		
		
		Collections.reverse(list);
		
		
		ListIterator<Character> listIterator = list.listIterator();
				
		while (listIterator.hasNext()) {
			
			System.out.print(listIterator.next());
			
		}
		
		
		
	}

}
