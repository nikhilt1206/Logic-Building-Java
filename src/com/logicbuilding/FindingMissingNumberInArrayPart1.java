package com.logicbuilding;

public class FindingMissingNumberInArrayPart1 {

	public static void main(String[] args) {

		int numbers[]= {1,2,4,5,6};
		int totalNumbers=6;
		int totalSumOfAllTheNumbers = (totalNumbers*(totalNumbers+1))/2;
		System.out.println(totalSumOfAllTheNumbers);
		int sumOfArray=0;
		for(int i=0;i<numbers.length;i++) {
			sumOfArray=sumOfArray+numbers[i];
		}
		System.out.println(sumOfArray);
		System.out.println("The missing number is : "+(totalSumOfAllTheNumbers-sumOfArray));
	}

}
