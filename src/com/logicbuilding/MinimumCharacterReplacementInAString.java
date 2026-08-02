package com.logicbuilding;

import java.util.Arrays;

public class MinimumCharacterReplacementInAString {

	public static void main(String[] args) {

		String[] data = {"ab","aab","abb","abab","abaaaba"};
		if(data==null ||data.length==0) {
			System.out.println("Invalid input!!");
			return; 
		}
		
		int[] result = new int[data.length];
		for(int w=0;w<data.length;w++) {
			String input = data[w];
			if (input == null || input.isEmpty()) {
			    result[w] = 0;
			    continue;
			}
			int count=0;
			int index=1;
			
			while(index<input.length()) {
				if(input.charAt(index)==input.charAt(index-1)) {
					count++;
					index+=2;
				}
				else {
					index++;
				}
			}
			result[w]=count;
		}
		System.out.println(Arrays.toString(result));
	}
}
