package com.logicbuilding;

public class StringDecoding {

	public static void main(String[] args) {

		String input = "d3m4t2b0a1";
		if (input == null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		StringBuilder sb = new StringBuilder();
		char currentChar = ' ';

		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				currentChar = input.charAt(i);
			} else if (Character.isDigit(input.charAt(i))) {
				int count = Character.getNumericValue(input.charAt(i));
				for (int j = 0; j < count; j++) {
					sb.append(currentChar);
				}
			}
		}
		System.out.println(sb);
	}
}
