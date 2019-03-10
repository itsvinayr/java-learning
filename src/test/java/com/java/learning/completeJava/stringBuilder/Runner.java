package com.java.learning.completeJava.stringBuilder;

public class Runner {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java 
		
	}

}
