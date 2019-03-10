package com.java.learning.completeJava.strings;

public class Immutable {

	public static void main(String[] args) {
		
		String s1= "Vinay";
		s1.concat("Raghumanda");
		
		System.out.println(s1);	// output is Vinay
		
		s1=s1.concat("Raghumanda");
		System.out.println(s1);// object of Vinay remain unchanged
		
	}

}
