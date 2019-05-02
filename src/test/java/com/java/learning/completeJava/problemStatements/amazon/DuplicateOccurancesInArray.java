package com.java.learning.completeJava.problemStatements.amazon;
import java.util.HashMap;

public class DuplicateOccurancesInArray {
	
	public static int[] num = {1,2,1,4,5,4,6,8,2};

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i: num)
			map.put(i, 0);
		System.out.println(map.toString());
		for(int i=0; i<num.length; i++) {
			if(map.containsKey(num[i])) {
				int count = map.get(num[i]);
				count++;
				map.put(num[i], count);
			}
		}
		System.out.println(map.toString());
	}

}
