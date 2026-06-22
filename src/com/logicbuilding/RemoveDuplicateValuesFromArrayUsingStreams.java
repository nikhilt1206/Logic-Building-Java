package com.logicbuilding;

import java.util.Arrays;

public class RemoveDuplicateValuesFromArrayUsingStreams {

	public static void main(String[] args) {

		int a[] = {20,10,30,20,10,40};
		
		a = Arrays.stream(a).distinct().toArray();
		
		System.out.println(Arrays.toString(a));
		
	}
}
