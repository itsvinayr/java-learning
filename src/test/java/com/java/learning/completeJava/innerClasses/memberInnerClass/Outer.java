package com.java.learning.completeJava.innerClasses.memberInnerClass;

public class Outer {

	private int data;
	Outer(int data){
		this.data=data;
	}
	
	class Inner{
		void print() {
			System.out.println(data);
		}
	}

}
