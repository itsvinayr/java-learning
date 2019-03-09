package com.java.learning.completeJava.collections.hashSet;

import java.util.HashSet;

public class Runner {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Hello");
		hs.add("Hello");
		hs.add("This");
		hs.add("is");
		hs.add("sparta");
		
		// print
		for(String s: hs) {
			System.out.print(s+" ");
		}
		
	}

}
