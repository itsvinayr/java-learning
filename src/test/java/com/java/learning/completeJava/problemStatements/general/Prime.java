package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check for prime ");
		int num = sc.nextInt();
		isPrime(num);

		System.out.println("range from : ");
		int start = sc.nextInt();
		System.out.println("range to : ");
		int end = sc.nextInt();
		primeNumbersBetween(start, end);
		System.out.println("Seive of erasthos");
		sieveOfErastos(start, end);

	}
	public static void isPrime(int num) {
		int temp;
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
	public static void primeNumbersBetween(int start, int end){
		boolean primeCheck;
		for(int i=start; i<=end; i++){
			if(i == 0 || i == 1) continue;
			if(i == 2) {
				System.out.println("Prime number is "+i);
				continue;
			}
			primeCheck=true;
			for(int j=2; j<i; j++){
				if(i%j == 0){
					primeCheck = false;
					break;
				}
			}
			if(primeCheck) System.out.println("Prime number is "+i);
		}
	}

	public static void sieveOfErastos(int start, int end){
		boolean[] prime = new boolean[end];
		for(int i=0; i<end; i++) prime[i]=true;
		for(int i=2; i<=Math.sqrt(end); i++){
			if(prime[i]){
				for(int j=i; j*i<end; j++){
					prime[j*i]=false;
				}
			}
		}
		for(int i=2; i<prime.length; i++){
			if(prime[i])
				System.out.println("Sieve Prime number is "+(i));
		}
	}
}
