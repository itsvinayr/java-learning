package com.java.learning.completeJava.problemStatements;

import org.testng.annotations.Test;

public class Fibonacci {
	@Test
	public void generateSeries() {
		int a=0, b=0, c=1;
		for(int i=0; i<=20; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
	}
}
