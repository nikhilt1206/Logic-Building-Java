package com.logicbuilding;

import java.util.HashSet;
import java.util.Set;

public class CountVowelInStringUsingHashSet {

	public static void main(String[] args) {

		String input = "Apple";
		int count = 0;
		
		Set<Character> vowelSet = new HashSet<Character>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		vowelSet.add('A');
		vowelSet.add('E');
		vowelSet.add('I');
		vowelSet.add('O');
		vowelSet.add('U');
		
		for(int index=0;index<=input.length()-1;index++) {
			if(vowelSet.contains(input.charAt(index))){
				count++;
			}
		}
		System.out.println("Total vowels present in string are : "+count);	
	}
}
