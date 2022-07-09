package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class Fibonacci {
	@Test
	public void generateSeries() {
		int a, b=1, c=1;
		System.out.println(0+"\n"+1);
		for(int i=2; i<=20; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
	}
	
	// Time complexity O(n)
	@Test
	public void usingRecursion() {
		for(int i=0; i<=9; i++) {
			System.out.print(fib(i)+"\t");
		}
	}
	
	public int fib(int n) {
		if(n<=1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	@Test
	public void usingDynamicProgramming() {
		dynamicFib(10);
	}
	
	public void dynamicFib(int n) {
		int[] f = new int[n];
		f[0] = 0;
		f[1] = 1;
		for(int i=2; i<n; i++) {
			f[i]=f[i-1]+f[i-2];
		}

		for(int i: f) System.out.print(i+"--");
	}	
}
