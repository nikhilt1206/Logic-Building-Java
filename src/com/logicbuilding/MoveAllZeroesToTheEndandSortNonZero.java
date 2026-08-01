package com.logicbuilding;

import java.util.Arrays;

public class MoveAllZeroesToTheEndandSortNonZero {
	public static void main(String[] args) {
		
		int[] input = {1,3,0,4,5,0,2,0};
		
		if(input==null || input.length==0) {
			System.out.println("Invalid input!!");
			return;
		}
		
		int index = 0;
		for(int num : input) {
			if(num!=0) {
				input[index]=num;
				index++;
			}
		}
		for(int i = index;i<=input.length-1;i++) {
			input[i]=0;
		}
		Arrays.sort(input,0,index);
		System.out.println(Arrays.toString(input));
	}
}
