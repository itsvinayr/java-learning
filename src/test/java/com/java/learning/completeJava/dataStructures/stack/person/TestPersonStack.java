package com.java.learning.completeJava.dataStructures.stack.person;

public class TestPersonStack {

	public static void main(String[] args) {

		Person p1 = new Person("Vinay", 31);
		Person p2 = new Person("Likhitha", 24);
		Person p3 = new Person("Anusha", 28);
		Person p4 = new Person("Surendra", 28);
		
		PersonStack stack = new PersonStack(30);
		stack.push(p1);
		stack.push(p2);
		stack.push(p3);
		stack.push(p4);
		
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
		
	}

}
