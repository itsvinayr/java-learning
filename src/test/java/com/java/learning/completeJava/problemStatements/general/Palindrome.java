package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome {
	@Test
	public void checkForPalindrome() {
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check for prime ");
		original = sc.nextLine();
		for(int i=original.length()-1; i>=0; i--) {
			reverse = reverse+original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Its a palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}
}
