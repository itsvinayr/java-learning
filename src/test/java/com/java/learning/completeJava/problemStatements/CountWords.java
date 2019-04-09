package com.java.learning.completeJava.problemStatements;

import java.util.HashMap;

import org.testng.annotations.Test;

public class CountWords {
	@Test
	public void usingHashMap() {
		String str = "This this is is done by Saket Saket";
		String[] split = str.split(" ");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = split.length - 1; i >= 0; i--) {
			if (hashMap.containsKey(split[i])) {
				int count = hashMap.get(split[i]);
				hashMap.put(split[i], count + 1);
			} else {
				hashMap.put(split[i], 1);
			}
		}
		System.out.println(hashMap);
	}

	@Test
	public void countCharacters() {
		String str = "This this is is done by Saket Saket";
		String[] split = str.split("");
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		for (int i = split.length - 1; i >= 0; i--) {
			if (hashMap.containsKey(split[i])) {
				int count = hashMap.get(split[i]);
				hashMap.put(split[i], count + 1);
			} else {
				hashMap.put(split[i], 1);
			}
		}
		System.out.println(hashMap);
	}
}
