package com.logicbuilding;

public class LeaderProbelm {

	public static void main(String[] args) {

		int a[] = {16,17,4,3,5,2};
	
		int length = a.length;
		int maxRight=a[length-1];
		
		System.out.print(maxRight+" ");
		
		for(int index=length-2;index>=0;index--) {
			if(a[index]>maxRight) {
				maxRight=a[index];
				System.out.print(maxRight+" ");
			}
		}
	}
}
