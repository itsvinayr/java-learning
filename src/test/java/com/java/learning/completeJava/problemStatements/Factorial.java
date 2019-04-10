package com.java.learning.completeJava.problemStatements;

import org.testng.annotations.Test;

public class Factorial {
	@Test
	public void getFactorial() {
		int n = 5;
		System.out.println(factorial(n));
		System.out.println(factorialUsingRecursion(n));
	}
	
	public int factorial(int n) {
		int sum=1;
		for(int i=1; i<=n; i++) {
			sum = sum*i;
		}
		return sum;
	}
	
	public int factorialUsingRecursion(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorialUsingRecursion(n-1);
	}
}
