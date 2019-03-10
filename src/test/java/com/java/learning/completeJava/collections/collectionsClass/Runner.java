package com.java.learning.completeJava.collections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Runner {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");

		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(al, Collections.reverseOrder());
		itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
