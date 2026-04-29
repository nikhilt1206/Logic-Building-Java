package com.logicbuilding;

public class ReverseAnInteger {

	public static void main(String[] args) {

		int number = 2147483647;
		int lastDigit;
		int reverseNumber=0;
		
		while(number!=0) {
			lastDigit=number%10;
			if(reverseNumber>Integer.MAX_VALUE/10 ||(reverseNumber==Integer.MAX_VALUE/10 && lastDigit>7)) {
				System.out.println(0);
				return;
			}
			if(reverseNumber<Integer.MIN_VALUE/10 ||(reverseNumber==Integer.MIN_VALUE/10 && lastDigit<-8)) {
				System.out.println(0);
				return;
			}
			reverseNumber=reverseNumber*10+lastDigit;
			number=number/10;
		}
		System.out.println("Reversed number is: "+reverseNumber);

	}

}
