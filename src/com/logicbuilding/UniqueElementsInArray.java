package com.logicbuilding;

import java.util.HashSet;

public class UniqueElementsInArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,1,2};
		
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();
		
		for(int num : a) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		seen.removeAll(duplicates);
		System.out.println(seen); 		
	}
}
