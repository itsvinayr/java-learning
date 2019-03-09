package com.java.learning.completeJava.io.scanner;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		print("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		print("Enter your age");
		int age = sc.nextInt();
		print("Enter city");
		String city = sc.next();
		sc.close();
		
		System.out.println(name+" with age "+age+" lives in city "+city);
		
	}
	
	public static void print(String name) {
		System.out.println(name);
	}

}
