package com.java.learning.completeJava.innerClasses.memberInnerClass;

public class Runner {

	public static void main(String[] args) {
		
		Outer outer = new Outer(100);
		Outer.Inner inner = outer.new Inner();
		inner.print();
		
	}

}
