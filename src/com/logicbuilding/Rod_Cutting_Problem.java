package com.logicbuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rod_Cutting_Problem {

	public static void main(String[] args) {

		int[] rods	= {1,1,3,4};
		if(rods==null || rods.length==0) {
			System.out.println("Invalid input!!");
			return;
		}
		
		Arrays.sort(rods);
		
		List<Integer> result = new ArrayList<>();
		List<Integer> rodList = new ArrayList<>();
		for(int rod : rods) {
			rodList.add(rod);
		}
		
		while(!rodList.isEmpty()) {
			result.add(rodList.size());
			int shortest = rodList.get(0);
			List<Integer> next = new ArrayList<>();
			for(int rod : rodList) {
				if(rod!=shortest) {
					next.add(rod-shortest);
				}
			}
			rodList=next;
		}
		System.out.println(result);
	}
}
