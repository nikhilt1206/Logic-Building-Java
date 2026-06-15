package com.logicbuilding;

public class FindTheLengthOfTheStringWithoutUsingLengthMethod {

	public static void main(String[] args) {

		String input = "Nikhil";
		
		char[] inputArray = input.toCharArray();
		int count = 0;
		
		for(char c : inputArray) {
			count++;
		}
		System.out.println("Length of String is : "+count);
	}
}
