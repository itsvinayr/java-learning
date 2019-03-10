package com.java.learning.completeJava.enumeration;

enum Days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Runner {

	public static void main(String[] args) {
		
		Days[] days = Days.values();
		for(int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		
		Days day = Days.valueOf("SUNDAY");
		System.out.println(day);
		
	}

}
