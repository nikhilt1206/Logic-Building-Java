package com.logicbuilding;

public class FindSecondLargestNumberFromString {

	public static void main(String[] args) {

		String input = "a13b2c054";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		findSecondLargest(input);
	}

	private static void findSecondLargest(String input) {

		char data[] = input.toCharArray();
		int num;
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(char c : data) {
			if(Character.isDigit(c)) {
				num = c - '0';
				if(num>first) {
					second = first;
					first = num;
				}
				if(num>second && num<first) {
					second = num;
				}
			}
		}
		System.out.println("Second Largest: "+second);
	}
}
