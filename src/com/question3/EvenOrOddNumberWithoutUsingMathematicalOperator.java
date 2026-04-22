package com.question3;

public class EvenOrOddNumberWithoutUsingMathematicalOperator {

	public static void main(String[] args) {

		int number = 5;
		if((number & 1)==1) {
			System.out.println(number+" is Odd number");
		}
		else {
			System.out.println(number+" is Even number");
		}
	}

}
