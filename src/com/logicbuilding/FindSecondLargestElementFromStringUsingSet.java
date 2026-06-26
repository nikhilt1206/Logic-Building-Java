package com.logicbuilding;

import java.util.TreeSet;

public class FindSecondLargestElementFromStringUsingSet {

	public static void main(String[] args) {

		String input = "1134a564b2c0";
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input!!");
			return;
		}
		findSecondLargest(input);

	}

	private static void findSecondLargest(String input) {
		
		char[] data = input.toCharArray();
		int num;
		TreeSet<Integer> dataSet = new TreeSet<Integer>();
		for(char c : data) {
			if(Character.isDigit(c)) {
				num = c - '0';
				dataSet.add(num);
			}
		}
		System.out.println(dataSet);
		if(dataSet.size() < 2){
		    System.out.println("Second largest element not found.");
		    return;
		}
		dataSet.pollLast();
		System.out.println("Second Largest Element : "+ dataSet.last());
	}
}
