package com.logicbuilding;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListManipulation {

	public static void main(String[] args) {
		//Print only numbers which have starting digit 1 as output

		List<Integer> numberList = Arrays.asList(1,22,32,null,123,100);
		if(numberList==null || numberList.size()==0) {
			System.out.println("Invalid input!!");
			return;
		}
		
		List<Integer> resultList = numberList.stream()
		.filter(Objects::nonNull)
		.filter(i->String.valueOf(Math.abs(i)).startsWith("1"))
		.collect(Collectors.toList());
		
		System.out.println(resultList);
	}
}
