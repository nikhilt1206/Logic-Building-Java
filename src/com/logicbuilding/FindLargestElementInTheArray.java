package com.logicbuilding;

public class FindLargestElementInTheArray {

	public static void main(String[] args) {

		int inputArray[] = {10,20,30,80,40,60,50};
		int largestElement=inputArray[0];
		
		for(int index=1;index<=inputArray.length-1;index++) {
			if(inputArray[index]>largestElement) {
				largestElement=inputArray[index];
			}
		}
		System.out.println("The largest element in the array is : "+largestElement);
	}

}
