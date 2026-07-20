package com.logicbuilding;

public class NameGenerator {

	public static void main(String[] args) {

		String[] names = {"Raj","Rahul","Amit"};
		if (names == null || names.length == 0) {
		    System.out.println("Invalid input!!");
		    return;
		}
		int maxLength=0;
		StringBuilder sb = new StringBuilder();
		
		for(String name : names) {
			maxLength = Math.max(maxLength, name.length());
		}
		
		for(int i=0;i<maxLength;i++) {
			for(String name : names) {
				if(i<name.length()) {
					sb.append(name.charAt(i));
				}
			}
		}
		System.out.println(sb.toString());
	}
}
