package com.InterviewQuestions;

public class WaterCapacity {

	static int findMaxCapacity(int[] arr) {
		int maxArea = Integer.MIN_VALUE;
		int start = 0;
		int end = arr.length - 1;
		//when start will be greater than end the loop will stop.
		while (start < end) {
			int width = end - start;
			int height = Math.min(arr[start], arr[end]);
			int area = width * height;
			maxArea = Math.max(maxArea, area);
			if (arr[start] < arr[end]) {
				start++;
			} else {
				end--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int ans = WaterCapacity.findMaxCapacity(arr);
		System.out.println("Max area value : " +ans);
	}
}
