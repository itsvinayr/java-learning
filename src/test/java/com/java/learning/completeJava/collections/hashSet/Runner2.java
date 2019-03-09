package com.java.learning.completeJava.collections.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class Runner2 {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<String>();
		data.add("Hello");
		data.add("World");
		data.add("This");
		data.add("is vinay");
		
		HashSet<String> hs = new HashSet<String>(data);
		hs.add("Edible");
		hs.add("Oils");
		hs.add("are");
		hs.add("dangerous");
		hs.add("prototypes");
		
		// print
		for(String s: hs) {
			System.out.print(s+" ");
		}
		
	}

}
