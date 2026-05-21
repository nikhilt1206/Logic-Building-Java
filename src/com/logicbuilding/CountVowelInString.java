package com.logicbuilding;

public class CountVowelInString {

	public static void main(String[] args) {

		String input ="Hello World";
		String vowels = "aeiouAEIOU";
		int count = 0;
		
		//Traversing the individual characters from String
		for(int index=0;index<=input.length()-1;index++) {
			if(vowels.indexOf(input.charAt(index))!=-1) {
				count++;
			}
		}
		System.out.println("Total number of vowels are : "+count);

	}

}
