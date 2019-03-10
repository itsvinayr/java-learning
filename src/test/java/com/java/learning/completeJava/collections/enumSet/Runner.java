package com.java.learning.completeJava.collections.enumSet;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Runner {

	public static void main(String[] args) {
		
		System.out.println(Days.TUESDAY);
		
		Set<Days> days = EnumSet.allOf(Days.class);
		System.out.println(days);
		
		Iterator<Days> it = days.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
