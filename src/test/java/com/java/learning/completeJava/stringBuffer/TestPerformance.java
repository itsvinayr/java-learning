package com.java.learning.completeJava.stringBuffer;

public class TestPerformance {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time take in ms "+(System.currentTimeMillis()-start));
		start = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time take in ms "+(System.currentTimeMillis()-start));
		
	}
	
	public static String concatWithString() {
		String t = "Java";
		for(int i=0; i<=10000; i++) {
			t=t+"Hello";
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
