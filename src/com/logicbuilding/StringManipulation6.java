package com.logicbuilding;

public class StringManipulation6 {

	public static void main(String[] args) {

		String input = "r@a56vi ku$%mar67";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		int sum=0;
		for(char c : input.toCharArray()) {
			if(Character.isLetter(c) || c==' ') {
				sb.append(c);
			}
			else if(Character.isDigit(c)) {
				sum = sum + Character.getNumericValue(c);
			}
		}
		sb.append(" ");
		sb.append(sum);
		System.out.println(sb.toString().trim());
	}
}
