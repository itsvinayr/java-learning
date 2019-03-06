package com.java.learning.completeJava.dataStructures.hashMapInternalImplementation;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {
		
		String s1 = "FB";
		String s2 = "Ea";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 * each key generates a hashcode and corresponds to index
		 * where key "one" is saved with value 1
		 */
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		/*
		 * s1 and s2 with same hash code
		 * are linked with linked list in table
		 */
		map.put(s1, 5);
		map.put(s2, 6);
		map.put("one", 7);
		map.put(null,8);// goes to zeroth bucket
		// loadfactor*size of table = threshold, if exceeds
		// size & threshold also will be doubles
		// by default, loadfactor 0.75*16 = 12, means if 
		// entries in map are more than 12, then size doubles
		// i.e 32 and threshold doubles 24
	}

}
