package com.programs;

public class Handle_String {

	public static void main(String[] args) {

		// 1st way to Join 3 individual strings
		String n = "jo.";
		String b = "thi.";
		String r = "ram.";

		String one = n.concat(b);
		String two = r.concat(one);

		System.out.println("join individual strings using concat : " + two);

		
		
		// 2nd way to Join 3 individual strings
		StringBuilder sb = new StringBuilder();

		StringBuilder append = sb.append(n);

		StringBuilder append2 = append.append(b);

		StringBuilder append3 = append2.append(r);

		System.out.println("join individual strings using append : " + append3);

		
		
		// split a string
		String s = "programminglanguageisjava";

		String[] split = s.split("a");

		for (String string : split) {

			System.out.println(string);
		}

		
		
		// replace a string
		String replace = s.replace("g", " ");

		System.out.println(replace);

	}

}
