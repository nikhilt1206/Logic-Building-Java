package com.logicbuilding;

public class FindLogestAndShortestWordInAString {

	public static void main(String[] args) {

		String input = "I love cricket and football";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		String[] words = input.split(" ");
		String longestWord = words[0];
		String shortestWord = words[0];
		
		for(String word : words) {
			if(word.length()<shortestWord.length()) {
				shortestWord = word;
			}
			if(word.length()>longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Shortest Word: "+shortestWord);
		System.out.println("Longest Word: "+longestWord);
	}
}
