package com.logicbuilding;

import java.util.Arrays;

public class ArrayRotationLeft {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int n = 2;
		int k = n % a.length;
		int left=0;
		int right=a.length-1;
		if(a == null || a.length == 0) {
			System.out.println("Invalid input");
			return;
		}
		a = reverseArray(a,left,k-1);
		System.out.println(Arrays.toString(a));
		a = reverseArray(a,k,right);
		System.out.println(Arrays.toString(a));
		a = reverseArray(a,left,right);
		System.out.println(Arrays.toString(a));
	}

	private static int[] reverseArray(int[] a, int left, int right) {
		int temp;
		while(left<right) {
			temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		return a;
	}
}
