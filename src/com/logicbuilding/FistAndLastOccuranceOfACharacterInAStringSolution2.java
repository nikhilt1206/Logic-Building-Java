package com.logicbuilding;

public class FistAndLastOccuranceOfACharacterInAStringSolution2 {

	public static void main(String[] args) {

		String input = "Hello World!";
		char charInput[] = input.toCharArray();
		int firstOccurence=-1;
		int lastOccurence=-1;
	    firstOccurence=input.indexOf('o');
	    lastOccurence=input.lastIndexOf('o');
		System.out.println("["+firstOccurence+","+lastOccurence+"]");
	}
}
