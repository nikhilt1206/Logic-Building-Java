package com.logicbuilding;

public class RemoveAllExtraWhiteSpaces {

	public static void main(String[] args) {

		String input = "   Hello    World   ";
		if(input==null||input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		input = input.trim();
		input = input.replaceAll("\\s+", " ");
		System.out.println(input);
	}

}
