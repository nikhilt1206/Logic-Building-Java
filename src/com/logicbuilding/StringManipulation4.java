package com.logicbuilding;

public class StringManipulation4 {

	public static void main(String[] args) {
	
		//Count of numbers coming after the decimal
		double number = 123.3456987;
		
		String input = String.valueOf(number);
		int indexOfDecimal = input.indexOf('.');
		System.out.println("Count of digits after decimal: "+(input.length()-indexOfDecimal-1));
	}
}
