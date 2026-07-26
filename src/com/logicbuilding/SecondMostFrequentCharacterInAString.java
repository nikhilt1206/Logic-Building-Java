package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentCharacterInAString {

	public static void main(String[] args) {

		String input = "aabbb";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return; 
		}
		
		Map<Character,Integer> frequencyMap = new HashMap<>();
		for(char c : input.toCharArray()) {
			frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
		}
		
		int firstMaxFreq = 0;
		int secondMaxFreq = 0;
		int currentFreq;
		
		for(Map.Entry<Character, Integer> entrySet : frequencyMap.entrySet()) {
			currentFreq = entrySet.getValue();
			if(currentFreq>firstMaxFreq) {
				secondMaxFreq = firstMaxFreq;
				firstMaxFreq = currentFreq;
			}
			else if(currentFreq>secondMaxFreq && currentFreq<firstMaxFreq) {
				secondMaxFreq = currentFreq;
			}
		}
		if(secondMaxFreq==0) {
			System.out.println("Second most frequent character not found!!");
			return;
		}
		
		for(Map.Entry<Character, Integer> entrySet: frequencyMap.entrySet()) {
			if(entrySet.getValue()==secondMaxFreq) {
				System.out.println("Second most frequent character: "+entrySet.getKey());
			}	
		}
	}
}
