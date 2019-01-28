package com.java.learning.completeJava.dataStructures.stack.person;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Name is "+name+"\t age is "+age;
	}

}
