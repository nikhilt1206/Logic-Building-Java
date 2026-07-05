package com.logicbuilding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderProbelm {

	public static void main(String[] args) {

		int a[] = {16,17,4,3,5,2};
	
		int length = a.length;
		int maxRight=a[length-1];
		List<Integer> list = new ArrayList<Integer>();
		list.add(maxRight);
		
		for(int index=length-2;index>=0;index--) {
			if(a[index]>maxRight) {
				maxRight=a[index];
				list.add(maxRight);
			}
		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
