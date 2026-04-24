package com.question5;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number=153;
		int copyNum=number;
		int lastDigit;
		int armstrongNum =0;
		while(copyNum!=0) {
			lastDigit=copyNum%10;
			armstrongNum=armstrongNum+(lastDigit*lastDigit*lastDigit);
			copyNum=copyNum/10;
		}
		if(number==armstrongNum) {
			System.out.println(number+" is an armstrong number");
		}
		else {
			System.out.println(number+" is not an armstrong number");
		}
	}

}
