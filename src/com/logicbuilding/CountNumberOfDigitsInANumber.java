package com.logicbuilding;

public class CountNumberOfDigitsInANumber {

	public static void main(String[] args) {

		int number = 1234;
		int lastDigit;
		int count=0;
		
		if(number==0) {
			 System.out.println("Number of digits : 1");
		     return;
		}
		while(number!=0) {
			//lastDigit=number%10;
			count++;
			number=number/10;
		}
		System.out.println("Number of digits : "+count);
	}

}
