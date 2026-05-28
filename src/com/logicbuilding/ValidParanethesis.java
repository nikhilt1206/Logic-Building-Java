
package com.logicbuilding;

import java.util.Stack;

public class ValidParanethesis {

	public static void main(String[] args) {

		String input = "{[(())]}";
		System.out.println(checkValidParanthesis(input));
	}

	private static boolean checkValidParanthesis(String input) {
		char inputArray[] = input.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char currentChar : inputArray) {
			if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
				stack.push(currentChar);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((currentChar == ')' && top != '(') || (currentChar == '}' && top != '{')
						|| (currentChar == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}