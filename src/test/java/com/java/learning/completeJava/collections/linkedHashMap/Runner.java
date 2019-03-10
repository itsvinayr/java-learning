package com.java.learning.completeJava.collections.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(101, "Vinay");
		lhm.put(102, "Chandrababu");
		lhm.put(103, "jagan");
		
		for(Map.Entry<Integer, String> s:lhm.entrySet()) {
			System.out.println(s.getKey()+"----"+s.getValue());
		}
		
		System.out.println("Keys "+lhm.keySet());
		System.out.println("Values "+ lhm.values());
		System.out.println("Entry values "+lhm.entrySet());
	}

}
