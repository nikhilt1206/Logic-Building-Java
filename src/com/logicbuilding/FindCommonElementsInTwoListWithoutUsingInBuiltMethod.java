package com.logicbuilding;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class FindCommonElementsInTwoListWithoutUsingInBuiltMethod {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("One");
		list1.add("How");
		list1.add("Ten");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Two");
		list2.add("Ten");
		list2.add("How");
		
		//Using Streams and Lambda Expressions (Functional Programming)

		Set<String> result = list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toSet());
		System.out.println(result);
		
		//if you are not supposed to use lambda expressions (only streams)
		
		Set<String> result2 = list1.stream().filter(list2::contains).collect(Collectors.toSet());
		System.out.println(result2);
	}
}
