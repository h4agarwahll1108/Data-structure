package com.InterviewQuestions;

import java.util.HashMap;

public class FirstUniqueCharacter {

	int firstUniqueCharacterIndex(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < text.length(); i++) {
			Character c = text.charAt(i);
			int freq = map.getOrDefault(c, 0);
			freq++;
			map.put(c, freq);
		}
		for (int i = 0; i < text.length(); i++) {
			Character c = text.charAt(i);
			if (map.get(c) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String text = "loveworklater";
		int result = new FirstUniqueCharacter().firstUniqueCharacterIndex(text);
		System.out.println("Index Position : " + result);
		System.out.println("Character is : " + text.substring(result, result + 1));
	}

}
