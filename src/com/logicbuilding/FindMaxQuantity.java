package com.logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class FindMaxQuantity {

	public static void main(String[] args) {

		String input[] = {"xyz 9","abc 20","xyz 21"};
		
		Map<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(String s : input) {
			String data[] = s.split(" ");
			String product = data[0];
			int quantity = Integer.parseInt(data[1]);
			hmap.put(product, hmap.getOrDefault(product, 0)+quantity);
		}
		int maxQuantity=0;
		String result=" ";
		
		for(Map.Entry<String, Integer> data : hmap.entrySet()) {
			if(data.getValue()>maxQuantity) {
				maxQuantity=data.getValue();
				result=data.getKey();
			}
		}	
		System.out.println(result+" "+maxQuantity);
	}
}
