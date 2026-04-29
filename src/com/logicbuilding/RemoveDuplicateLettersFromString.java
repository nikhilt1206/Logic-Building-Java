package com.logicbuilding;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLettersFromString {

	public static void main(String[] args) {

		String input = "Java";
		Set<Character> linkedHashSet = new LinkedHashSet<Character>();
		char[] inputCharArray = input.toCharArray();
		//String result="";
		StringBuilder sb = new StringBuilder();
		
		for (char character : inputCharArray) {
			if(linkedHashSet.add(character)) {
				//result = result + character; - 3 string created - "J", "Ja", "Jav"
				sb.append(character); //only 1 string created - "Jav"
			}
		}
		System.out.println(sb);
	}

}
