package com.logicbuilding;

public class FindingMissingNumberInArrayPart2 {

	public static void main(String[] args) {

		int numbers[] = {1,2,4,5,6};
		int missingNumber=0;
		
		for(int num:numbers) {
			missingNumber=missingNumber^num;
		}
		
		for(int i=1;i<=6;i++) {
			missingNumber=missingNumber^i;
		}
		System.out.println("The missing number is : " +missingNumber);
	}

}
