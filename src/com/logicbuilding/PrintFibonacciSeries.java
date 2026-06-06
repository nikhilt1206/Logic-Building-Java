package com.logicbuilding;

public class PrintFibonacciSeries {

	public static void main(String[] args) {

		int num=10;
		int first = 0;
		int second = 1;
		int next;
		if(num==1) {
			System.out.println(first);
			System.exit(0);
		}
		System.out.print(first+" "+second+" ");
		for(int i=2;i<num;i++) {
			next=first+second;
			System.out.print(next+" ");
			first=second;
			second=next;
		}
	}

}
