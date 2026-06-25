package com.logicbuilding;

public class CountTotalUppercaseAndLowercaseCharactersInString {

	public static void main(String[] args) {

		String input = "aAbBcDFGH";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input");
			return;
		}
		int upperCount = 0;
		int lowerCount = 0;
		
		for(char temp : input.toCharArray()) {
			if(Character.isUpperCase(temp)) {
				upperCount++;
			}
			else if(Character.isLowerCase(temp)) {
				lowerCount++;
			}
		}
		System.out.println("Uppercase count : "+upperCount+ " and Lowercase count : "+lowerCount);
	}
}
