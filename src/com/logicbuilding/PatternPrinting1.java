package com.logicbuilding;

public class PatternPrinting1 {

	public static void main(String[] args) {

		int totalNumberOfLines = 5;
		for (int row = 1; row <= totalNumberOfLines; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println("");
		}
	}

}
