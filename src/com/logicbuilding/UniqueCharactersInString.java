package com.logicbuilding;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharactersInString {

	public static void main(String[] args) {

		String input = "programming";
		
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		input = input.toLowerCase();
		LinkedHashMap<Character,Integer> hmap = new LinkedHashMap<>();
		for(char c : input.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}

		boolean foundUnique = false;
		for(Map.Entry<Character, Integer> data : hmap.entrySet()) {
			if(data.getValue()==1) {
				System.out.print(data.getKey()+" ");
				foundUnique=true;
			}
		}
		if(!foundUnique) {
		    System.out.println("No unique characters found.");
		}
	}
}
