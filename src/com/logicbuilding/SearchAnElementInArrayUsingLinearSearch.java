package com.logicbuilding;

public class SearchAnElementInArrayUsingLinearSearch {

	public static void main(String[] args) {

		int[] inputArray = { 10, 20, 30, 5, 40 };
		int key = 5;
		boolean isPresent = false;

		for (int number: inputArray) {
			if (number == key) {
				isPresent=true;
				break;
			}
		}
		if(isPresent) {
			System.out.println("Value Found in the Array");
		}
		else {
			System.out.println("Value not present in Array!");
		}
	}

}
