package com.logicbuilding;

import java.util.ArrayList;

public class StringManipulation5 {

	public static void main(String[] args) {

		String input = "a1b2c3";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		ArrayList<Character> list = new ArrayList<>();
		for(char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				list.add(c);
			}
		}
		int index = list.size()-1;
		StringBuilder sb = new StringBuilder();
		for(char c : input.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(list.get(index));
				index--;
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
