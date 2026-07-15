package com.logicbuilding;

public class StringManipulation {

	public static void main(String[] args) {

		String input ="99956";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<input.length()-1;i++) {
			result.append(input.charAt(i));
			int currentNum = Character.getNumericValue(input.charAt(i));
			int nextNum = Character.getNumericValue(input.charAt(i+1));
			
			if(currentNum%2!=0 && nextNum%2!=0 &&currentNum==nextNum) {
				result.append("-");
			}
		}
		result.append(input.charAt(input.length()-1));
		System.out.println(result);
	}
}
