package com.logicbuilding;

public class TotalNumberOfCharactersDontHaveWhiteSpaceBeforeAndAfter {

	public static void main(String[] args) {

		String input = "my name is bipin";
		int count = 0;
		
		for(int i=0;i<input.length();i++) {
			char currentChar = input.charAt(i);
			if(currentChar == ' ') {
				continue;
			}
			boolean whiteSpaceBeforeChar = (i>0) && (input.charAt(i-1)==' ');
			boolean whiteSpaceAfterChar = (i<input.length()-1)&&(input.charAt(i+1)==' ');
			if(!whiteSpaceBeforeChar && !whiteSpaceAfterChar) {
				count++;
			}
		}
		System.out.println("Total number of character : "+count);
	}
}
