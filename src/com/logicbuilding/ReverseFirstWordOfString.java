package com.logicbuilding;

public class ReverseFirstWordOfString {

	public static void main(String[] args) {

		String input = "Hello world from Java";
		reverseFirstWord(input);
	}

	private static void reverseFirstWord(String input) {

		if (input == null || input.isEmpty()) {
			System.out.println("Cannot reverse the string");
			return;
		}
		String words[] = input.split(" ", 2);
		char charArray[] = words[0].toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		char temp;
		while (left < right) {
			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		String reversedFirstWord = new String(charArray);
		if (words.length == 1) {
			System.out.println(reversedFirstWord);
		} else {
			System.out.println(reversedFirstWord + " " + words[1]);
		}
	}
}
