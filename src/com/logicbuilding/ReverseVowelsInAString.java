package com.logicbuilding;

import java.util.Arrays;

public class ReverseVowelsInAString {

	public static void main(String[] args) {

		String input = "Hello";
		String vowel = "aeiouAEIOU";
		char[] inputArray = input.toCharArray();
		int left=0;
		int right=inputArray.length-1;
		
		while(left<right) {
			if(vowel.indexOf(inputArray[left])==-1) {
				left++;
			}
			else if(vowel.indexOf(inputArray[right])==-1) {
				right--;
			}
			else {
				char temp;
				temp=inputArray[left];
				inputArray[left]=inputArray[right];
				inputArray[right]=temp;
				left++;
				right--;
			}
		}
		System.out.println(inputArray);
	}
}
