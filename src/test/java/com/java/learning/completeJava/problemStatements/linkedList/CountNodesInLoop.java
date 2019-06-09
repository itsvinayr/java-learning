package com.java.learning.completeJava.problemStatements.linkedList;

public class CountNodesInLoop {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addSequentially(30);
        list.addSequentially(3);
        list.addSequentially(11);
        list.addSequentially(17);
        list.addSequentially(18);
        list.addSequentially(1);
        list.addSequentially(36);
        list.head.next.next.next.next.next.next.next=list.head;

        System.out.println(list.countNodesInLoop(list.head));



    }
}
