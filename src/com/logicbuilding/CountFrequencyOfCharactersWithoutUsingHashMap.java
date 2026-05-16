package com.logicbuilding;

public class CountFrequencyOfCharactersWithoutUsingHashMap {

	public static void main(String[] args) {

		String input =  "abccaadddd";
		int frequency[] = new int[256];
		char inputArray[] = input.toCharArray();
		
		for(char currentChar :inputArray) {
			frequency[currentChar]++;
		}
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]>0) {
				System.out.println((char) i + "->" +frequency[i]);
			}
		}

	}

}
