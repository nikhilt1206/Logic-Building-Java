package com.logicbuilding;

public class ReverseTheCaseInAString {

	public static void main(String[] args) {

		String input = "Hello World";
		
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid Input!!");
			return;
		}
		
		char[] data = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(char c : data) {
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			}
			else if(Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
