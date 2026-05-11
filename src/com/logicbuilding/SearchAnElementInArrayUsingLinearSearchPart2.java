package com.logicbuilding;

public class SearchAnElementInArrayUsingLinearSearchPart2 {

	public static void main(String[] args) {

		int[] inputArray = { 10, 20, 30, 5, 40 };
		int key = 5;
		boolean isPresent = false;
		int position = -1;
		for(int i=0;i<=inputArray.length-1;i++) {
			if(inputArray[i]== key) {
				isPresent=true;
				position=i;
				break;
			}
		}
		
		if(isPresent) {
			System.out.println("Value Found in the Array at position : "+position );
		}
		else {
			System.out.println("Value not present in Array!");
		}

	}

}
