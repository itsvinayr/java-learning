package com.java.learning.completeJava.enumeration;

enum Student{
	VINAY(31), ANUSHA(28), LIKHITHA(24);
	private int age;
	Student(int age){
		this.age=age;
	}
	int getAge() {
		return age;
	}
}

public class Runner2 {

	public static void main(String[] args) {
		
		Student[] students = Student.values();
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i]+" with age "+students[i].getAge());
		}
		
	}

}
