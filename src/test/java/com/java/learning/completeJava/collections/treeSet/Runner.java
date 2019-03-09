package com.java.learning.completeJava.collections.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Runner {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Hello");
		ts.add("Hello");
		ts.add("This");
		ts.add("is");
		ts.add("sparta");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}  
		
	}

}
