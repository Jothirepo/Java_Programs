package com.topics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linkedhashmap_methods {

	public static void main(String[] args) {
		
		
		Map<String, Character> limap = new LinkedHashMap<String, Character>();
		
		limap.put("Jothi", 's');
		limap.put("ram", 's');
		limap.put("lingam", 'p');
		limap.put("jo", null);
		limap.put("tr", null);
		limap.put(null, 'z');
		limap.put(null, 'o');
		limap.put("Jothi", null);
		
		System.out.println("LinkedHashMap printed here" + limap);
		System.out.println("****************************************************************************");
		
		Set<Entry<String, Character>> entrySet = limap.entrySet();
		System.out.println("Keys & their respective values printed here" + entrySet);
		System.out.println("****************************************************************************");
		

		System.out.println("Keys & their respective values are iterated & printed");
		for (Entry <String, Character> entries : entrySet) {
			
			System.out.println(entries);
		}

	}

}
