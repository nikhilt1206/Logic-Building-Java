package com.logicbuilding;

import java.util.HashMap;

public class FindFrequencyOfSpecialCharacterInString {

	public static void main(String[] args) {

		String s = "abs#@#";
		char charArray[]=s.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : charArray) {
			if(!(c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') || (c==' ')) {
				if(map.containsKey(c)) {
					map.put(c, map.get(c)+1);
				}
				else {
					map.put(c, 1);
				}
			}
		}
		for(char c : map.keySet()) {
			System.out.println(c + " -> " + map.get(c));
		}
	}
}
