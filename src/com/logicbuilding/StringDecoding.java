package com.logicbuilding;

public class StringDecoding {

	public static void main(String[] args) {

		String input = "d3m4t2b0a1";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<input.length();i=i+2) {
			char letter = input.charAt(i);
			int count = Character.getNumericValue(input.charAt(i+1));
			for(int j=0;j<count;j++) {
				sb.append(letter);
			}
		}
		System.out.println(sb);
	}
}
