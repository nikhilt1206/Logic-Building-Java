package com.logicbuilding;

public class BinaryStringManipulation {

	public static void main(String[] args) {

		String input = "10010101";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : input.toCharArray()) {
			if(c=='0' && sb.length()>0 && sb.charAt(sb.length()-1)=='1') {
				sb.deleteCharAt(sb.length()-1);
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
	}
}
