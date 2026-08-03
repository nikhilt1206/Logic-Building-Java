package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class HackathonScoreCalculatorIBM {

	public static void main(String[] args) {

		String erica = "EMH";
		String bob = "HME";
		if (erica == null || bob == null ||
			erica.isEmpty() || bob.isEmpty() ||
			erica.length() != bob.length()) {
			System.out.println("Invalid input!!");
			return;
		}
		
		Map<Character, Integer> scoreCard = new HashMap<>();
		scoreCard.put('E', 1);
		scoreCard.put('M', 3);
		scoreCard.put('H', 5);
		
		int erica_final_score=0;
		int bob_final_score=0;
		
		for(int i=0;i<erica.length();i++) {
			char ericaPoint = erica.charAt(i);
			char bobPoint = bob.charAt(i);
			erica_final_score += scoreCard.get(ericaPoint);
			bob_final_score += scoreCard.get(bobPoint);
		}
		if(erica_final_score>bob_final_score) {
			System.out.println("Winner is Erica with score : "+erica_final_score);
		}
		else if(bob_final_score>erica_final_score) {
			System.out.println("Winner is Bob with score : "+bob_final_score);
		}
		else if(erica_final_score==bob_final_score) {
			System.out.println("Tie");
		}
	}
}
