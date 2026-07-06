package com.logicbuilding;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharactersFromString {

	public static void main(String[] args) {

		String input = "abbacdaab";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder sb = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			if(set.add(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
