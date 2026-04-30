package com.logicbuilding;

public class CheckPalindromeNumber {

	public static void main(String[] args) {

		int number=121;
		int originalNumber =number;
		int lastDigit;
		int reverseNumber=0;
		
		while(number!=0) {
			lastDigit=number%10;
			reverseNumber = (reverseNumber *10) + lastDigit;
			number=number/10;
		}
		if(originalNumber-reverseNumber==0) {
			System.out.println(originalNumber+" is a palindrome number.");
		}
		else {
			System.out.println(originalNumber+" is not a palindrome number.");
		}

	}

}
