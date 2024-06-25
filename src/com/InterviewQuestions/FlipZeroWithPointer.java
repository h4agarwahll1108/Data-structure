package com.InterviewQuestions;

public class FlipZeroWithPointer {

	static int flipZero(int[] arr) {
		int maxOnes = Integer.MIN_VALUE;
		int beforeZero = 0;
		int afterZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				afterZero++;
			} else {
				maxOnes = Math.max(maxOnes, beforeZero + afterZero + 1);
				beforeZero = afterZero;
				afterZero = 0;
			}
		}
		return Math.max(maxOnes, beforeZero + afterZero + 1);
	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 1, 1, 0, 1 };
		int len = FlipZeroWithPointer.flipZero(array);
		System.out.println("len = " + len);
	}
}
