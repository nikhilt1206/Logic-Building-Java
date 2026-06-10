package com.logicbuilding;

public class SquareMatrixTranspose {

	public static void main(String[] args) {

		int a[][] = new int[2][2];
		
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[0].length;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		//Swapping diagonal elements 
		for(int row=0;row<a.length;row++) {
			for(int col=row+1;col<a[0].length;col++) {
				int temp = a[row][col];
				a[row][col]=a[col][row];
				a[col][row]=temp;
			}
		}
		System.out.println("Transpose Matrix : ");
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[0].length;col++) {
				System.out.print(a[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
