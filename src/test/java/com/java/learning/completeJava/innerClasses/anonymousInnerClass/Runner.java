package com.java.learning.completeJava.innerClasses.anonymousInnerClass;

public class Runner {

	public static void main(String[] args) {

		Person p = new Person() {
			public void eat() {
				System.out.println("A person eats");
			}
		};
		p.eat();
		
		Eatable e = new Eatable() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		e.eat();
		
	}

}
