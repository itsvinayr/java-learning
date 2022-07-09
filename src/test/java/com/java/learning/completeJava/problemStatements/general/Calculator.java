package com.java.learning.completeJava.problemStatements.general;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Input first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Input second number");
        sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("operation to perform : + - / *");
        sc = new Scanner(System.in);
        String op = sc.next();
        switch (op){
            case "+":
                System.out.println("Sum of "+a+" and "+b+": "+(a+b));
                break;
            case "-":
                System.out.println("Difference of "+a+" and "+b+": "+(a-b));
                break;
            case "/":
                System.out.println("Division of "+a+" and "+b+": "+(a/b));
                break;
            case "*":
                System.out.println("Multiplication of "+a+" and "+b+": "+(a*b));
                break;
        }
    }
}
