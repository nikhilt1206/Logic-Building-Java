package com.logicbuilding;

public class SumOfArrayElements {

	public static void main(String[] args) {

		int numbers[]= {1,24,33,44};
		int sum = 0;
		
		for(int index=0;index<=numbers.length-1;index++) {
			sum=sum+numbers[index];
		}
		System.out.println("Sum of array elements: "+sum);

	}

}
