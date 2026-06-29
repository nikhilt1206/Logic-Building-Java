package com.logicbuilding;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyOfWordsInAString {

	public static void main(String[] args) {

		String input ="Hi my name is Rohan Rohan";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		String words[] = input.split(" ");
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		
		for(String s : words) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		for(Map.Entry<String, Integer> data : map.entrySet()) {
			System.out.println(data.getKey()+"->"+data.getValue());
		}	
	}
}
