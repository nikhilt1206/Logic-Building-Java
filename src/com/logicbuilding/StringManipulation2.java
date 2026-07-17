package com.logicbuilding;

public class StringManipulation2 {

	public static void main(String[] args) {

		String input = "Tomorrow";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		StringBuilder sb = new StringBuilder();
		int oCount=0;
		
		for(char c : input.toCharArray()) {
			if(c=='o'||c=='O') {
				oCount++;
				sb.append("@".repeat(oCount));
			}
			else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}
