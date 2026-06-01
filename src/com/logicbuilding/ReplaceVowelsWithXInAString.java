package com.logicbuilding;

public class ReplaceVowelsWithXInAString {

	public static void main(String[] args) {

		String input = "Name";
		input = input.toLowerCase();
		char inputArray[] = input.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(char currentChar : inputArray) {
			if(isVowel(currentChar)){
				sb.append('x');
			}
			else {
				sb.append(currentChar);
			}
		}
		System.out.println(sb.toString());
	}
	public static boolean isVowel(char currentChar) {
		if(currentChar=='a'||currentChar=='e'||currentChar=='i'||currentChar=='o'||
				currentChar=='u') {
			return true;
		}
		else {
			return false;
		}
	}
}
