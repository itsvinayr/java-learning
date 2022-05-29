package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

import java.util.Stack;

public class NextGreaterElement {
    @Test
    public void nextGreaterElement() {
        int[] arr = {11, 13, 21, 3};
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            isFound = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isFound = true;
                    System.out.println("Next greater element for " + arr[i] + " is " + arr[j]);
                    break;
                }
            }
            if (!isFound)
                System.out.println("Next greater element for " + arr[i] + " is " + -1);
        }
    }

    @Test
    public void usingStack() {
        int arr[] = {5, 3, 2, 10, 6, 8, 1, 4, 12, 7, 4};
        Stack<Integer> s = new Stack<>();
        int element, next;
        s.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            next = arr[i];
            if (!s.isEmpty()) {
                element = s.pop();
                while (element < next) {
                    System.out.println(element + " --> " + next);
                    if (s.isEmpty()) break;
                    element = s.pop();
                }
                if (element > next) s.push(element);
            }
            s.push(next);
        }

        while (!s.isEmpty()) {
            element = s.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }
    }
}
