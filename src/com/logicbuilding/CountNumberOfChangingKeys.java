package com.logicbuilding;

public class CountNumberOfChangingKeys {

	public static void main(String[] args) {

		String input="abBcdDe";
		
		int count =0;
		char lastKey;
		
		lastKey=input.toCharArray()[0];
		lastKey = Character.toLowerCase(lastKey);
		for(int i=1;i<=input.length()-1;i++) {
			char currentKey = input.toCharArray()[i];
			currentKey = Character.toLowerCase(currentKey);
			if(currentKey!=lastKey) {
				count++;
			}
			lastKey=currentKey;
		}
		System.out.println("Changing Keys Count: "+count);

	}

}
