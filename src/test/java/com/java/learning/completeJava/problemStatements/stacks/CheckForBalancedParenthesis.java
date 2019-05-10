package com.java.learning.completeJava.problemStatements.stacks;

public class CheckForBalancedParenthesis {

	public static void main(String[] args) {
		String s = "[()]{}{[()()]()}";
		//String s = "[[)]]}}{{";
		
		Stack stack = new Stack(10);
		for(int i=0; i<s.length(); i++) {
			if(i==0) {
				stack.push(s.charAt(i));
				continue;
			}else {
				if(isOpenBrace(s.charAt(i))) {
					stack.push(s.charAt(i));
				}else {
					char openBrace = getOpenBrace(s.charAt(i));
					if(openBrace==stack.pop()) {
						continue;
					}else {
						System.out.println("Not a balanced");
						System.exit(0);
					}
				}
			}
		}
	}

	private static boolean isOpenBrace(char charAt) {
		if(charAt=='{') {
			return true;
		}else if(charAt=='(') {
			return true;
		}else if(charAt=='[') {
			return true;
		}
		System.out.println("Returning false");
		return false;
	}

	private static char getOpenBrace(char charAt) {
		if(charAt=='}') {
			return '{';
		}else if(charAt==')') {
			return '(';
		}else if(charAt==']') {
			return '[';
		}
		System.out.println("Returning zero");
		return 0;
	}

}
