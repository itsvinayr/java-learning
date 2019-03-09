package com.java.learning.completeJava.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Runner {

	public static void main(String[] args) {

		LinkedList<String> ls = new LinkedList<String>();
		ls.add("Hello");
		ls.add("World");
		ls.add("This");
		ls.add("is vinay");

		// print using for each
		for (String s : ls)
			System.out.print(s + " ");
		System.out.println();

		// print using iterator
		Iterator<String> it = ls.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
		System.out.println();
		
		// traverse list of elements in reverse order
		it = ls.descendingIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");

		}
	}

}
