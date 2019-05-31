package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseAString {
	
	@Test
	public void usingStringBuilder() {
		String s = "Vinay";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		System.out.println(sb.reverse());
	}

	@Test
	public void usingCharAt() {
		
		String s = "vinay";
		System.out.println("Reversed String is ");
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}		
	}
	
	@Test
	public void usingSplit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String input = sc.nextLine();
		String[] token = input.split("");
		System.out.println("Reversed String is ");
		for(int i = token.length-1; i>=0; i--) {
			System.out.print(token[i]);
		}
	}

}
