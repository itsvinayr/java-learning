package com.java.learning.completeJava.dataStructures.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner2 {

	public static void main(String[] args) {
		
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(new Laptop("Dell", 8, 65000));
		list.add(new Laptop("Apple", 6, 150000));
		list.add(new Laptop("Asus", 14, 80000));
		
		print(list);		
		Collections.sort(list, new Comparator<Laptop>() {

			public int compare(Laptop o1, Laptop o2) {
				if(o1.getPrice()>o2.getPrice())
					return 1;
				else
					return -1;
			}
		});	
		print(list);

	}
	
	public static void print(List<Laptop> list) {
		for(Laptop l:list) {
			System.out.println(l);
		}
	}

}
