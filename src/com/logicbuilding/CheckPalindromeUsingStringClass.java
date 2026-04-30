package com.logicbuilding;

public class CheckPalindromeUsingStringClass {

	public static void main(String[] args) {

		int number =121;
		//Convert number to String
		String originalNumberInString = Integer.toString(number);
		//String originalNumberInString2=number+"";
		
		StringBuilder reverseStringBuilder = new StringBuilder(originalNumberInString);
		String reverseString = reverseStringBuilder.reverse().toString();
		
		//Compare 2 Strings
		if(originalNumberInString.equals(reverseString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrime");
		}

	}

}
