package com.java.learning.completeJava.strings;

public class StringComparisions {

	public static void main(String[] args) {
		
		String s1 = "Vinay";
		String s2 = "Vinay";
		String s3 = new String("Vinay");
		String s4 = new String("Zenith");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s4.compareTo(s1));
	}

}
