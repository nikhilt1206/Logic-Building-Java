package com.logicbuilding;

public class MonotonicArrays {

	public static void main(String[] args) {

		int inputArray[] = {1,2,3,4,5,6};
		boolean increasing = true;
		boolean decreasing = true;
		
		for(int i=1;i<=inputArray.length-1;i++) {
			if(inputArray[i-1]<inputArray[i]) {
				decreasing=false;
			}
			else {
				if(inputArray[i-1]>inputArray[i]) {
					increasing=false;
				}
			}
		}
		if(increasing||decreasing) {
			System.out.println("The given array is monotonic");
		}
		else {
			System.out.println("The given array is not monotonic");
		}
	}

}
