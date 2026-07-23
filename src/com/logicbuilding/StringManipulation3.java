package com.logicbuilding;

public class StringManipulation3 {

	public static void main(String[] args) {

		//Print sum of digits in the string
		String input = "QWE12RTX350Y10";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input");
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		for(char c :input.toCharArray()) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}
			else if(sb.length()>0) {
				sum = sum + Integer.parseInt(sb.toString());
				sb.setLength(0);
			}
		}
		if(sb.length()>0) {
			sum = sum + Integer.parseInt(sb.toString());
		}
		System.out.println(sum);
	}
}
