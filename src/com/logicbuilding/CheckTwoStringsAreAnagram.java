package com.logicbuilding;

import java.util.Arrays;

public class CheckTwoStringsAreAnagram {

	public static void main(String[] args) {

		String s1 = "silent";
		String s2 = "listen";
		boolean result = checkAnagram(s1,s2);
		if(result) {
			System.out.println("Both strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram!");
		}

	}

	private static boolean checkAnagram(String s1, String s2) {
		if(s1.length()==s2.length()) {
			char s1Array[]=s1.toCharArray();
			char s2Array[]=s2.toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			if(Arrays.equals(s1Array, s2Array)) {
				return true;
			}
		}
		return false;
	}

}
