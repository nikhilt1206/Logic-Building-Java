package com.logicbuilding;

public class SwapTwoNumbersSolution1 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("Before Swapping: ");
		System.out.println("a : "+a+ " and b: "+b);
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping: ");
		System.out.println("a : "+a+ " and b: "+b);
		
	}

}
