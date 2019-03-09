package com.java.learning.completeJava.collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Vinay");
		map.put(102, "Anusha");
		map.put(103, "Sai");
		
		for(Map.Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey()+"---"+m.getValue());
		}
		
	}

}
