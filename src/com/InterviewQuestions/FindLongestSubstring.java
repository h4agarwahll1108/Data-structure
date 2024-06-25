package com.InterviewQuestions;

import java.util.HashMap;

public class FindLongestSubstring {
	
	int longestSubString(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int maxlen = Integer.MIN_VALUE;
		for(int i=0; i<text.length();i++) {
			Character c = text.charAt(i);
			int index = map.getOrDefault(c, -1);
			if(index != -1) {
				int len = i-index;
			maxlen = Math.max(maxlen, len);
			}
			map.put(c, i);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		String text = "abcdefabcdefghia";
		int result = new FindLongestSubstring().longestSubString(text);
		System.out.println("length of longest substring : " + result);
	}

}
