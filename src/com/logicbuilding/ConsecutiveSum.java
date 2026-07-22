package com.logicbuilding;

public class ConsecutiveSum {

	public static void main(String[] args) {

		int[] arr = {7,5,1,4,5,8,2};
		int target = 10;
		
		if(arr==null||arr.length==0) {
			System.out.println("Invalid input!!");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum = sum +arr[j];
				if(sum==target) {
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k]+" ");
					}
					System.out.println("");
					//System.out.println("Start Index: " + i + ", End Index: " + j); - To print indices
				}
				if(sum>target) {
					break;
				}
			}
		}
	}
}
