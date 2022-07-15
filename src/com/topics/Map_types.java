package com.topics;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_types {

	public static void main(String[] args) {
		
		Map<Integer, String> ma = new HashMap<Integer, String>();
		
		ma.put(1, "jothi");
		ma.put(4, "john");
		ma.put(2, null);
		ma.put(null, "jacob");
		ma.put(null, "rathore");
		ma.put(7, null);
		
		System.out.println("In map, key overrided duplicate null/values but value printed duplicate null/values " + ma);
		
		int mapsize = ma.size();
		System.out.println("no of entries in the above key-value pairs");
		System.out.println("Map will ignore duplicate keys, so will consider only original/overrided key's value pair : " + mapsize);
		
		boolean containsKey = ma.containsKey(4);
		System.out.println(containsKey);
		boolean containsValue = ma.containsValue("john");
		System.out.println(containsValue);
		boolean empty = ma.isEmpty();
		System.out.println("whether the map is empty or not : " + empty);
		
		
		String string = ma.get(1);		//no default return type for 'get' method, it is based on wrapper class we define while creating object for collection
		System.out.println("Get value based on key : " + string);
		String string2 = ma.get(20);
		System.out.println(string2);
		
		System.out.println("*********************************************");
		
		Set<Integer> keySet = ma.keySet();
		System.out.println("list of keys : " + keySet);
		
		System.out.println("*******************Keys iterated one by one**********************");
		
		for (Integer integer : keySet) {
			
			System.out.println(integer);
			
		}
		
		System.out.println("*******************values iterated one by one**********************");
		
		Collection<String> values = ma.values();
		
		for (String string3 : values) {
		
			System.out.println(string3);
		}
		
		System.out.println("*********************************************");
		
		
	
	}
		
	}


