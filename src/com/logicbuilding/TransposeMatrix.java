package com.logicbuilding;

public class TransposeMatrix {

	public static void main(String[] args) {

		int a[][] = new int[2][3];

		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;

		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;

		if (a == null || a.length == 0 || a[0].length == 0) {
			System.out.println("Transpose is not possible");
		} 
		else {
			int result[][] = new int[a[0].length][a.length];

			for (int row = 0; row < a.length; row++) {
				for (int col = 0; col < a[0].length; col++) {
					result[col][row] = a[row][col];
				}
			}
			
			System.out.println("Transpose Matrix : ");
			for (int row = 0; row < result.length; row++) {
				for (int col = 0; col < result[row].length; col++) {
					System.out.print(result[row][col] + " ");
				}
				System.out.println();
			}

		}
	}

}
