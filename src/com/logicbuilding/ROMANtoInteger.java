package com.logicbuilding;

import java.util.HashMap;

public class ROMANtoInteger {

	public static void main(String[] args) {

		String s = "IX";
		int result = 0;
		int prevValue = 0;
		
		HashMap<Character,Integer> romanMap = new HashMap<Character,Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		
		for(int i=s.length()-1;i>=0;i--) {
			char currentChar = s.charAt(i);
			int currentValue = romanMap.get(currentChar);
			if(currentValue>=prevValue) {
				result=result+currentValue;
			}
			else {
				result=result-currentValue;
			}
			prevValue=currentValue;
		}
		System.out.println(s+"->"+result);
	}

}
