package com.java.learning.completeJava.stringBuilder;

public class TestPerformance {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken by String builder in ms "+(System.currentTimeMillis()-start));
		start = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken by String buffer in ms "+(System.currentTimeMillis()-start));
		
	}
	
	public static StringBuilder concatWithStringBuilder() {
		StringBuilder t = new StringBuilder("Java");
		for(int i=0; i<=10000; i++) {
			t=t.append(i);
		}
		return t;
	}
	
	public static StringBuffer concatWithStringBuffer() {
		StringBuffer t = new StringBuffer("Java");
		for(int i=0; i<=10000; i++) {
			t=t.append(i);
		}
		return t;
	}

}
