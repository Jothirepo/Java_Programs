package com.topics;


import java.util.*;
import java.util.Map.Entry; //check once



public class Treemapmethods {

	public static void main(String[] args) {
		
		Map<Object, String> tmap = new TreeMap<Object, String>();
		
		tmap.put("ramu", "kilo");
		tmap.put("ram", "kilo");
		tmap.put(32, "kilo");
		tmap.put("Jo", null);
		tmap.put("tr", null);
	//	tmap.put(null, 'z');		//null keys are not allowed
		tmap.put("Jothi", null);
		
		System.out.println("Tree map : " + tmap);
		
		System.out.println("****************************************************************************");
	
		Set<Entry<Object, String>> entrySet = tmap.entrySet();
		
		for (Entry<Object, String> entry : entrySet) {
			
			System.out.println(entry);
		}
	}

}
