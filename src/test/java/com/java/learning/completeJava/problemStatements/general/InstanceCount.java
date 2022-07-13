package com.java.learning.completeJava.problemStatements.general;

class A{
    public static int count = 0;
    public A(){
        count++;
    }
}

class B{
    public static int count = 0;
    public B(){
        count++;
    }
}

public class InstanceCount {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        B b = new B();

        System.out.println("Count of A : "+a.count);
        System.out.println("Count of B : "+b.count);
    }
}
