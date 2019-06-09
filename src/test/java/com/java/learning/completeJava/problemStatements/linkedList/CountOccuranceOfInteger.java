package com.java.learning.completeJava.problemStatements.linkedList;

public class CountOccuranceOfInteger {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addSequentially(30);
        list.addSequentially(3);
        list.addSequentially(11);
        list.addSequentially(17);
        list.addSequentially(3);
        list.addSequentially(17);
        list.addSequentially(3);

        list.print();

        System.out.println(list.count(3, list.head));
        System.out.println(list.count(17, list.head));
    }
}
