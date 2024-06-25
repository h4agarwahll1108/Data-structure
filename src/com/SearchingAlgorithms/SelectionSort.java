package com.SearchingAlgorithms;
//Time complexity O(n^2) 
//Space complexity O(1)
//better than bubble sort as less amount of swapping required
public class SelectionSort {

	public static void selectionSort(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			int index = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}

			}
			if (index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 50, 30, 10, 60, 80 };
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		SelectionSort.selectionSort(array);
		System.out.println("\nAfter Sorting");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}

	}

}
