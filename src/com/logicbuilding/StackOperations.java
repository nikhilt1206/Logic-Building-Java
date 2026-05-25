package com.logicbuilding;

import java.util.Stack;

public class StackOperations {

	public static void main(String[] args) {

		Stack <String> stack = new Stack<String>();
		stack.push("Apple");    //4
		stack.push("Banana");  //3
		stack.push("Orange"); //2
		stack.push("Mango"); //top element 1 
//		System.out.println(stack);
//		String topElement = stack.peek();
//		System.out.println(topElement);
//		String elementOutFromStack = stack.pop();
//		System.out.println(elementOutFromStack);
//		topElement=stack.peek();
//		System.out.println(topElement);
//		stack.pop();
//		System.out.println(stack.isEmpty());
		
		stack.pop(); //remove the element from the stack - top element
		stack.peek(); //return top element's value 	
		stack.isEmpty(); //true if empty otherwise false !	
		//search() - if element found returns position from top and if not found returns -1
		int position = stack.search("cherry");//search is case sensitive "apple" & "Apple" are different
		System.out.println(position);

	}

}
