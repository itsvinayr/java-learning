package com.java.learning.completeJava.innerClasses.staticNestedClass;

public class Outer {
	
	private static int n;
	
	static class Inner{
		void msg() {
			System.out.println(n);
		}
	}

}
