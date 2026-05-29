package com.logicbuilding;

public class CountNumberOfChangingKeys {

	public static void main(String[] args) {

		String input="abBcd";
		
		int count =0;
		char lastKey;
		
		char inputArray[]=input.toCharArray();
		lastKey = inputArray[0];
		lastKey = Character.toLowerCase(lastKey);
		for(int i=1;i<=inputArray.length-1;i++) {
			char currentKey = inputArray[i];
			currentKey = Character.toLowerCase(currentKey);
			if(currentKey!=lastKey) {
				count++;
			}
			lastKey=currentKey;
		}
		System.out.println(count);

	}

}
