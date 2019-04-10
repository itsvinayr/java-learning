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
		for(int i=0; i<=9; i++) {
			System.out.print(dynamicFib(i)+"\t");
		}
	}
	
	public int dynamicFib(int n) {
		int[] f = new int[n+2];
		f[0] = 0;
		f[1] = 1;
		for(int i=2; i<=n; i++) {
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}	
}
