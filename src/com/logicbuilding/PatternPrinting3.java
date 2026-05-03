package com.logicbuilding;

public class PatternPrinting3 {

	public static void main(String[] args) {

		int totalNumberOfLines = 5;
		for (int row = 1; row <= totalNumberOfLines; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print((char)('a'+col-1));
			}
			System.out.println("");
		}
		
	}

}
