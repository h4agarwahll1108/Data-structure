package com.InterviewQuestions;

import java.util.HashMap;

public class FindMostCommonWords {

	private String getMostCommonWords(String text) {
		String[] words = text.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			int freq = map.getOrDefault(words[i], 0);
			freq++;
			map.put(words[i], freq);
		}
		String maxCountWordKey = "";
		int maxValue = Integer.MIN_VALUE;
		for (String key : map.keySet()) {
			int value = map.get(key);
			if (value > maxValue) {
				maxValue = value;
				maxCountWordKey = key;
			}
		}
		return maxCountWordKey;
	}

	public static void main(String[] args) {

		String text = "Bob hit a ball the hit ball flew far after it was hit";
		String result = new FindMostCommonWords().getMostCommonWords(text);
		System.out.println("Most Common Words : " + result);

	}

}
