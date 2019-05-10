package com.java.learning.completeJava.problemStatements.stacks;

public class TwoStacks {
	
	private int top1;
	private int top2;
	private int size;
	private int[] array;
	
	public TwoStacks(int size) {
		this.top1=-1;
		this.top2=size-1;
		this.array=new int[size];
	}
	
	public void push1(int item) {
		if(top1<top2) {
			array[++top1]=item;
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public void push2(int item) {
		if(top1<top2) {
			array[top2--]=item;
		}else {
			System.out.println("Stack is full");
		}
	}
	
	public int pop1() {
		if(top1==-1) {
			return 0;
		}else {
			return array[top1--];
		}
	}
	
	public int pop2() {
		if(top2==size) {
			return 0;
		}else {
			return array[++top2];
		}
	}
	
	public void print() {
		System.out.println();
		for(int i: array)
			System.out.print(i+"\t");
	}

}
