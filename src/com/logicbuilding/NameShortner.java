package com.logicbuilding;

public class NameShortner {

	public static void main(String[] args) {

		String fullName = "Vidya Bhushan Tiwari";
		String nameParts[] = fullName.trim().split("\\s+");
		if (nameParts.length < 2) {
			System.out.println(fullName);
		} 
		else 
		{
			StringBuilder sb = new StringBuilder();

			for (int index = 0; index < nameParts.length - 1; index++) {
				sb.append(nameParts[index].charAt(0));
				sb.append(". ");
			}
			sb.append(nameParts[nameParts.length - 1]);
			System.out.println(sb);
		}
	}
}
