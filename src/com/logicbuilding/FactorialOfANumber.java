package com.logicbuilding;

import java.math.BigInteger;

public class FactorialOfANumber {

	public static void main(String[] args) {

		int number =20;
//		for(int i=1;i<=number;i++) {
//			result=result*i;
//		}
		//Factorial of a large number - variation 
		
		BigInteger result = BigInteger.ONE;
		for(int i=1;i<=number;i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Factorial of "+number+" is : "+result);
	}

}
