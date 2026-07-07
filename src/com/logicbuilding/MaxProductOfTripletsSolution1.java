package com.logicbuilding;

import java.util.Arrays;

public class MaxProductOfTripletsSolution1 {

	public static void main(String[] args) {

		int a[] = {-10,-3,5,6,-20};
		Arrays.sort(a);
		int n = a.length;
		if(n<3) {
			System.err.println("Minimum number of elements should be 3");
			return;
		}
		System.out.println(Arrays.toString(a));
		
		//CASE 1 : Assume all elements are positive (a[4]*a[3]*a[2])
		int resultOne = a[n-1] * a[n-2] * a[n-3];
		
		//CASE 2 : Assume on the 0th and 1st index we have negative numbers 
		int resultTwo = a[0] * a[1] * a[n-1];
		
		int result = Math.max(resultOne, resultTwo);
		System.out.println("Max product : "+result);
	}
}
