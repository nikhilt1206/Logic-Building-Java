	package com.logicbuilding;

import java.util.HashMap;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {

		String input = "madam";
		char charArray[] = input.toCharArray();
		HashMap<Character,Integer> freqMap = new HashMap<Character,Integer>();
		
		for(char c : charArray) {
			freqMap.put(c, freqMap.getOrDefault(c, 0)+1);
		}
		
		for(char c : freqMap.keySet()) {
			System.out.println(c + " -> " + freqMap.get(c));
		}

	}

}
