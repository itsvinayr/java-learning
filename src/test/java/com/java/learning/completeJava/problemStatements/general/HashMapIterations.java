package com.java.learning.completeJava.problemStatements.general;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.Test;

public class HashMapIterations {

	@Test
	public void usingIterator() {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "vinay");
		map.put(2, "arun");
		map.put(3, "james");
		map.put(4, "jagan");
		
		Iterator<?> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey()+"---"+me.getValue());
		}
		System.out.println();
		
	}
	
	@Test
	public void usingAdvancedForLoop() {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "vinay");
		map.put(2, "arun");
		map.put(3, "james");
		map.put(4, "jagan");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.print(m.getKey()+"---"+m.getValue());
		}
		
		System.out.println();
		
	}
}
