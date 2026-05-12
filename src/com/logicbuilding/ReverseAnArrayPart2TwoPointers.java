package com.logicbuilding;

public class ReverseAnArrayPart2TwoPointers {

	public static void main(String[] args) {

		int inputArray[] = {10,20,30,40,50};
		
		int left=0;
		int right=inputArray.length-1;
		
		while(left<right) {
			int temp;
			temp=inputArray[left];
			inputArray[left]=inputArray[right];
			inputArray[right]=temp;
			left++;
			right--;
		}
		for(int num:inputArray) {
			System.out.print(num+" ");
		}

	}

}
