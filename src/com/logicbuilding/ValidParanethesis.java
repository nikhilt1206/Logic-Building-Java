package com.logicbuilding;

import java.util.Stack;

public class ValidParanethesis {

	public static void main(String[] args) {

		String input = "(())";
		System.out.println(checkValidParanthesis(input));
	}
	private static boolean checkValidParanthesis(String input) {
    
		char inputArray[] = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		
		for(char currentChar:inputArray) {
			if(currentChar=='(') {
				stack.push(currentChar);
			}
			else {
				if(currentChar==')') {
					if(stack.isEmpty()) {
						return false;
					}
					else {
						char topChar = stack.pop();
						if(topChar!='(') {
							return false;
						}
					}
				}
			}
		}
		return stack.isEmpty();
	}
}
