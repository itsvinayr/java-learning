package com.java.learning.completeJava.collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Runner {

	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<String>();
		data.add("Hello");
		data.add("World");
		data.add("This");
		data.add("is vinay");
		
		// print using for each
		for(String s:data)
			System.out.print(s+" ");
		System.out.println();
		
		// print using iterator
		Iterator<String> it = data.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		// print using list iterator
		ListIterator<String >it2 = data.listIterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+" ");
		}
		System.out.println();
		
		//print in reverse order
		while(it2.hasPrevious()) {
			System.out.print(it2.previous()+" ");
		}
		
	}

}
