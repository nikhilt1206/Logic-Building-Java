package com.logicbuilding;

public class StringRotation {
	
	public static void main(String[] args) {
		
		String s1 = "INTERVIEW";
		String s2 = "VIEWINTER";
		
		if (s1 == null || s2 == null) {
		    System.out.println("Invalid input");
		    return;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()==s2.length() && ((s1+s1).contains(s2))) {
			System.out.println("Both strings are rotation of each other");
		}
		else {
			System.out.println("They are not rotation of each other");
		}
	}
}
