package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Prime {
	@Test
	public void testPrimeNumber() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check for prime ");
		int num = sc.nextInt();
		int temp = 0;
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++) {
			temp = num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}
}
