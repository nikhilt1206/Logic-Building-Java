package com.logicbuilding;

public class CalculateSumOfNumbersFromAString {

	public static void main(String[] args) {

		String input = "This is 1000 and it should be 20 30 50 1050";
		if(input==null || input.isEmpty()) {
			return;
		}
		
		String words[] = input.split(" ");
		int sum = 0;
		for(String word : words) {
			try {
				int num = Integer.parseInt(word);
				sum=sum+num;
			}
			catch(NumberFormatException e) {
				
			}
		}
		System.out.println("Result is : "+sum);
	}
}
