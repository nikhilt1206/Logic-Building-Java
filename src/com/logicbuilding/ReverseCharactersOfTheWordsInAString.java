package com.logicbuilding;

public class ReverseCharactersOfTheWordsInAString {

	public static void main(String[] args) {

		String input = "This is fun";
		if (input == null || input.isEmpty()) {
			System.out.println("Invalid Input");
			return;
		}
		String words[] = input.split(" ");

		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			char[] characters = word.toCharArray();
			int left = 0;
			int right = characters.length - 1;
			while (left < right) {
				char temp = characters[left];
				characters[left] = characters[right];
				characters[right] = temp;
				left++;
				right--;
			}
			sb.append(characters).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
