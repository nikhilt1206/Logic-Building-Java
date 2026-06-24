package com.logicbuilding;

public class CheckMountainArray {

	public static void main(String[] args) {

		int a[] = {1,2,5,3,0};
		
		System.out.println(mountainArrayCheck(a));

	}

	private static boolean mountainArrayCheck(int[] a) {
		
		//1. Length of the array must be greater than 2
		if(a.length<3) {
			return false;
		}
		
		//2. Elements must be in increasing order!!
		int i=0;
		while(i+1<a.length && a[i]<a[i+1]) {
			i++;
		}
		if(i==0 || i==a.length-1) {
			return false;
		}
		//3. Once we reach peak, elements must be in decreasing order!!
		while(i+1<a.length && a[i]>a[i+1]) {
			i++;
		}
		return i==a.length-1;
	}

}
