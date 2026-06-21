package com.logicbuilding;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValuesFromArray {

	public static void main(String[] args) {

		int a[] = {20,10,30,20,10,40};
		
		Set<Integer> dataSet = new LinkedHashSet<Integer>();
		
		for(int num : a) {
			dataSet.add(num);
		}
		
		int result[] = dataSet.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(result));
	}
}
