package com.logicbuilding;

import java.util.ArrayList;

public class PrintEvenAndOddNumberFromArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(36);
		al.add("Java");
		al.add(23);
		al.add(null);
		al.add(24.5);
		
		//System.out.println(al);
		
		for(Object o : al) {
			if(o instanceof Integer) {
				Integer i = (Integer)o;
				int x = i.intValue();
				if(x%2==0){
					System.out.println("Even: "+o);
				}
				else {
					System.out.println("Odd: "+o);
				}
			}
		}
	}

}
