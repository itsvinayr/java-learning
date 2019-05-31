package com.java.learning.completeJava.problemStatements.general;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Duplicates {
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
	
	@Test
	public void duplicateCharactersInAString() {
		String input = "Sakkett";
		char[] charArray = input.toCharArray();
		int count;
		for(int i=0; i<charArray.length; i++) {
			count = 0;
			for(int j=i+1; j<charArray.length; j++) {
				if(charArray[i]==charArray[j]) {
					count++;
					System.out.println(charArray[j]+"--"+count);
				}
			}
		}
	}
	
	@Test
	public void duplicateNumbersInAnArray() {
		int[] arr = {12, 31, 12, 23, 17, 31, 26, 12, 76, 56, 23, 17, 100, 100};
		Arrays.sort(arr);
		print(arr);
		int[] temp = new int[arr.length-1];
		int j = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
			}
		}
		temp[j]=arr[arr.length-1];
		print(temp);
	}
	
	public void print(int[] arr) {
		for(int a: arr)
			System.out.print(a+"\t");
		System.out.println();
	}
}
