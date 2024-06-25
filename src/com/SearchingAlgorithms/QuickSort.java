package com.SearchingAlgorithms;
//Time complexity O(n^2)
//Space Complexity O(Log n)
//Quick sort space complexity is Best
public class QuickSort {

	public static void quickSort(int[] arr, int low, int high) {

		if (low > high) {
			return;
		}
		int mid = low + (high - low) / 2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
	}

	public static void main(String[] args) {
		
		int[] array = { 1, 50, 30, 10, 60, 80 };
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		QuickSort.quickSort(array,0,array.length-1);
		System.out.println("\nAfter Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

	}
}
