package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class LeapYear {
	
	@Test
	public void testLeapYear() {
		int year = 2004;
		/*
		 * should be a multiple of 400 or (multiple of 4 but not 100)
		 */
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			System.out.println("Its a leap year");
		}
	}

}
