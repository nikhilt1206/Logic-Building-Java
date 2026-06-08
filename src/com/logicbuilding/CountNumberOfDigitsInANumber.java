package com.logicbuilding;

public class CountNumberOfDigitsInANumber {

	public static void main(String[] args) {

		int number = 12345;
		int lastDigit;
		int count=0;
		
		while(number!=0) {
			lastDigit=number%10;
			count++;
			number=number/10;
		}
		System.out.println("Number of digits : "+count);
	}

}
