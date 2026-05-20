package com.logicbuilding;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int a[]= {1,3,2,7,5,6};
		int largestNum =Integer.MIN_VALUE;
		int secondLargestNum=Integer.MIN_VALUE;
		
		for(int number : a) {
			if(number>largestNum) {
				secondLargestNum = largestNum;
				largestNum=number;
			}
			else if(number>secondLargestNum && number!=largestNum) {
				secondLargestNum=number;
			}
		}
		System.out.println("Second Largest Number in array : "+secondLargestNum);
	}

}
