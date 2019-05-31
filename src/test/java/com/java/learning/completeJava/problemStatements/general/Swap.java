package com.java.learning.completeJava.problemStatements.general;

import org.testng.annotations.Test;

public class Swap {

	@Test
	public void usingThirdVariable() {

		int a = 10, b = 20, temp;
		
		temp = a;
		a = b;
		b = temp;

		System.out.print("a " + a + " b " + b);

	}
	
	@Test
	public void withoutUsingThirdVariable() {
		int a=10, b=20;
		
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.print("a " + a + " b " + b);
	}

}
