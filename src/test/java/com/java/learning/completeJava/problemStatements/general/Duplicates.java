package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Duplicates {
	@Test
	public void duplicateCharacters() {
		String str = "Sakkett";
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			} else {
				hashMap.put(arr[i], 1);
			}
		}

		for(Map.Entry<Character, Integer> map: hashMap.entrySet()){
			if(map.getValue() > 1)
				System.out.println("Character "+map.getKey()+" duplicated for "+map.getValue());
		}
	}
}
