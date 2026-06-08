package com.logicbuilding;

public class CountNumberOfDigitsInANumberUsingStringClassMethod {

	public static void main(String[] args) {

		int number=12345;
		String s = Integer.toString(number);
		System.out.println("Number of digits : "+s.length());
	}
}
