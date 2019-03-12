package com.java.learning.completeJava.exceptions;

class InvalidAgeException extends Exception{

	InvalidAgeException(String s){
		super(s);
	}
}

public class TestCustomException {
	
	static void validateAge(int age)throws Exception{
		if(age<18) {
			throw new InvalidAgeException("invalid age");
		}else {
			System.out.println("welcome to vote");
		}
	}

	public static void main(String[] args) {
		
		try {
			validateAge(13);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");
		
	}

}
