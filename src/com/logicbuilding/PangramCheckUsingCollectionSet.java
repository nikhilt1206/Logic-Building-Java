	package com.logicbuilding;
	
	import java.util.HashSet;
	
	public class PangramCheckUsingCollectionSet {
	
		public static void main(String[] args) {
	
			String input = "The quick brown fox jumps over the lazy dog";
			boolean result = pangramCheck(input);
			if(result) {
				System.out.println("Pangram String");
			}
			else {
				System.out.println("Not a pangram string");
			}
		}
	
		private static boolean pangramCheck(String input) {
			HashSet<Character> characterSet = new HashSet<Character>();
			char[] inputCharArray = input.toLowerCase().toCharArray();
			for(char c:inputCharArray) {
				if(Character.isLetter(c)) {
					characterSet.add(c);
				}
			}
			if(characterSet.size()==26) {
				return true;
			}
			return false;
			
		}
	
	}
