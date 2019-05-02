package com.java.learning.completeJava.problemStatements.amazon;
import java.util.HashMap;

public class NumberOfCharacterOccurances {
	
	public static void main(String[] args) {
		String s = "I would love to work with Freshworks Freshworks";
		String[] array = s.split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<array.length; i++) {
			map.put(array[i], 0);
		}
		
		System.out.println(map.toString());
		
		for(int i=0; i<array.length; i++) {
			if(map.containsKey(array[i])) {
				int count = map.get(array[i]);
				count++;
				map.put(array[i], count);
			}
		}
		
		System.out.println(map.toString());
	}

}
