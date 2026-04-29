package com.logicbuilding;

public class LengthOfLastWordInString {

	public static void main(String[] args) {

		String s = "   Helllo World   ";
		int count=0;
		//s=s.trim();
		//System.out.println(s);
		
		char[] inputArray = s.toCharArray();
		for(int i=inputArray.length-1;i>=0;i--) {
			if(inputArray[i]!=' ') {
				count =count+1;
			}
			else {
				if(count>0) {
					System.out.println(count);
					break;
				}
			}
		}

	}

}
