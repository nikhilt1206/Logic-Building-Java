package com.logicbuilding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumProblemReturnsAllPairs {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		int target = 6;
		
		List<int[]> results =  calculateTwoSum(a,target);
		for(int[] pair : results) {
			System.out.println(pair[0]+" "+pair[1]);
		}

	}
	
	private static List<int[]> calculateTwoSum(int a[],int target){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		List<int[]> resultList = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			int complement = target-a[i];
			if(map.containsKey(complement)) {
				resultList.add(new int[] {map.get(complement), i});
			}
			map.put(a[i], i);
		}
		return resultList;
	}

}
