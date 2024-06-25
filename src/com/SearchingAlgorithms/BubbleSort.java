package com.SearchingAlgorithms;

//Time Complexity O(n^2)
//sapce complexity O(1)
public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 50, 30, 10, 60, 80 };
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		BubbleSort.bubbleSort(array);
		System.out.println("\nAfter Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

	}
}
