package com.java.learning.completeJava.collections.linkedHashSet;

import java.util.LinkedHashSet;

public class Runner {

	public static void main(String[] args) {
		
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
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
