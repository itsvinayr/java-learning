package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class SquareRoot {
	@Test
	public void testSquareRoot() {
		double n = 36;
		double sqrt = Math.sqrt(n);
		System.out.println(sqrt);
	}
	
	@Test
	public void codeToFindSquareRoot() {
		double n = 36;
		double sqrt = n/2;
		double t;
		do {
			t=sqrt;
			sqrt=(t+(n/t))/2; // sqrt(n+1) = (sqrt(n)+(num/sqrt(n)))/2;
		}while((t-sqrt)!=0);
		System.out.println(sqrt);
	}
}
