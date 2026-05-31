package com.logicbuilding;

public class SeparateAlphabetAndNumbersFromAString {

	public static void main(String[] args) {
		
		String input = "Ra123j";
		char inputArray[] = input.toCharArray();
		StringBuilder numbers = new StringBuilder();
		StringBuilder alphabets = new StringBuilder();
		for(char currentChar :inputArray) {
			if(Character.isDigit(currentChar)) {
				numbers.append(currentChar);
			}
			else if(Character.isAlphabetic(currentChar)) {
				alphabets.append(currentChar);
			}
		}
		System.out.println(alphabets.toString());
		System.out.println(numbers.toString());
	}
}
