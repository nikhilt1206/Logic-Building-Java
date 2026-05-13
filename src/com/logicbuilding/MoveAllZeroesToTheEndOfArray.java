package com.logicbuilding;

public class MoveAllZeroesToTheEndOfArray {

	public static void main(String[] args) {

		int input[] = {1,0,2,0,3,0};
		int putNonZeroValuesHere = 0;
		int temp;
		
		for(int current=0;current<=input.length-1;current++) {
			if(input[current]!=0) {
				temp = input[putNonZeroValuesHere];
				input[putNonZeroValuesHere]=input[current];
				input[current]=temp;
				putNonZeroValuesHere++;
			}
		}
		for(int num:input) {
			System.out.print(num+" ");
		}
	}

}
