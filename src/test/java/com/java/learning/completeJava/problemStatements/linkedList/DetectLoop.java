package com.java.learning.completeJava.problemStatements.linkedList;

public class DetectLoop {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addSequentially(30);
        list.addSequentially(3);
        list.addSequentially(11);
        list.addSequentially(17);

        System.out.println(list.detectLoop(list.head));
        System.out.println(list.detectLoopUsingFlyodsCycleFinding(list.head));

        // Creating a loop
        list.head.next.next.next.next = list.head;

        System.out.println(list.detectLoop(list.head));
        System.out.println(list.detectLoopUsingFlyodsCycleFinding(list.head));
    }
}
