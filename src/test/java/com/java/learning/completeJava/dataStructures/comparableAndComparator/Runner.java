package com.java.learning.completeJava.dataStructures.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop("Dell", 8, 65000));
		list.add(new Laptop("Apple", 6, 95000));
		list.add(new Laptop("Asus", 14, 150000));
		
		print(list);		
		Collections.sort(list);
		print(list);	

	}
	
	public static void print(List<Laptop> list) {
		for(Laptop l:list) {
			System.out.println(l);
		}
	}

}
