package com.logicbuilding;

public class ReverseAnArrayPart1 {

	public static void main(String[] args) {

		int inputArray[] = {10,20,30,40,50};
		int reverseInput[] = new int[inputArray.length];
		int reverseIndex=0;

		for(int i=inputArray.length-1;i>=0;i--) {
			reverseInput[reverseIndex]=inputArray[i];
			reverseIndex++;
		}
		for(int num:reverseInput) {
			System.out.print(num + " ");
		}
		System.out.println("");
		inputArray=reverseInput;
		for(int num:inputArray) {
			System.out.print(num + " ");
		}

	}

}
