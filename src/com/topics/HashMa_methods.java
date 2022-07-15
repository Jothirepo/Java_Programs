package com.topics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMa_methods {

	public static void main(String[] args) {

		Map<String, Character> map = new HashMap<String, Character>();

		map.put("Jothi", 's');
		map.put("ram", 's');
		map.put("lingam", 'p');
		map.put("jo", null);
		map.put("tr", null);
		map.put(null, 'z');
		map.put(null, 'o');
		map.put("Jothi", null);
		
		
		Character character = map.get("Jothi");
		System.out.println(character);
		
		
		Set<String> keySet = map.keySet();
		System.out.println("keys : " + keySet);
		
		Collection<Character> values = map.values();
		System.out.println("values : " + values);
		
		
		//for_iterating_key_and_their_respective_values
		
		Set<Entry<String, Character>> entrySet = map.entrySet();
		
		System.out.println("keys & their respective values : " + entrySet);
		
		for (Entry<String, Character> entry : entrySet) {
			
			System.out.println(entry);
			
		}
		
		
	}

}
