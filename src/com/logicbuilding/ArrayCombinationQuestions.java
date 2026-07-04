package com.logicbuilding;

import java.util.Arrays;

public class ArrayCombinationQuestions {

	public static void main(String[] args) {

		int a[] = {4,5,10,3,7};
		
		//1. Calculate sum of all array elements
		
		int sum = 0;
		for(int num : a) {
			sum = sum+num;
		}
		double avg = ((double)sum)/a.length;
		System.out.println("Sum of array : "+sum);
		System.out.println("Average of array : "+avg);
		
		
		//2. Find Largest and Second Largest number in the array
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		boolean isSecondLargestFound = false;
		
		for(int num : a) {
			if(num>largest) {
				if(largest!=Integer.MIN_VALUE) {
					isSecondLargestFound = true;
				}
				secondLargest=largest;
				largest=num;
			}
			else if(num>secondLargest && num<largest) {
				secondLargest=num;
				isSecondLargestFound = true;
			}
		}
		System.out.println("Largest number : "+largest);
		if(isSecondLargestFound) {
			System.out.println("Second Largest number : "+secondLargest);
		}
		else {
            System.out.println("Second largest not found!!");
        }
		
		//3. Reverse first half of the array
		
		int left=0;
		int mid = a.length/2;
		int right = mid-1;
		int halfReversedArray[] = reverseArray(a,left,right);
		System.out.println(Arrays.toString(halfReversedArray));

	}

	private static int[] reverseArray(int[] a, int left, int right) {
		int temp;
		while(left<right) {
			temp = a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		return a;
	}
}
