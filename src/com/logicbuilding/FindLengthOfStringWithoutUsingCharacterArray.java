package com.logicbuilding;

public class FindLengthOfStringWithoutUsingCharacterArray {

	public static void main(String[] args) {

		String input = "HelloNikhil";
		
		if(input==null || input.isEmpty()) {
			System.out.println("Invalid input");
			return;
		}
		
		int count =0;
		while(true) {
			try {
				input.charAt(count);
				count++;
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Length of the String : "+count);
				break;
			}
		}

	}
}
