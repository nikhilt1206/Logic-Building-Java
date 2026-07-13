package com.logicbuilding;

public class EncodingString {

	public static void main(String[] args) {

		String input = "ddmmmmtta";
		if (input == null || input.isEmpty()) {
			System.out.println("Invalid Input");
			return;
		}
		int count = 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				sb.append(input.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}
		sb.append(input.charAt(input.length() - 1));
		sb.append(count);
		System.out.println(sb);
	}
}
