package com.java.learning.completeJava.innerClasses.localInnerClass;

public class Outer {
	
	private int data;
	
	Outer(int data){
		this.data=data;
	}
	
	void display() {
		class Inner{
			void printData() {
				System.out.println(data);
			}
		}
		
		Inner inner = new Inner();
		inner.printData();
	}
}
