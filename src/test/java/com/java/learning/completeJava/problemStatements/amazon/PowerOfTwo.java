package com.java.learning.completeJava.problemStatements.amazon;

import org.testng.annotations.Test;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = n & (n-1);
        if(val == 0){
            System.out.println("power of 2");
        }else{
            System.out.println("not a power of 2");
        }
    }
}
