package com.logicbuilding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {

		int num1[] = {1,2,2,1};
		int num2[] = {2,2};
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();
		
		for(int num : num1) {
			set1.add(num);
		}
		for(int num : num2) {
			if(set1.contains(num)) {
				resultSet.add(num);
			}
		}
		
		int result[] = new int[resultSet.size()];
		int index=0;
		for(int val : resultSet) {
			result[index]=val;
			index++;
		}
		System.out.println(Arrays.toString(result));
	}
}
