package com.java.learning.completeJava.strings;

public class UsingNewKeyword {

	public static void main(String[] args) {

		String s1="java";
		char[] ch = {'a', 'b', 'c', 'd'};
		String s2 = new String(ch);
		String s3 = new String("example");
		
		System.out.println(s1+"--"+s2+"--"+s3);
		
	}

}
