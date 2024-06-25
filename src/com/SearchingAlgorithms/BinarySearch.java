package com.SearchingAlgorithms;

//Data to be in sorted form
//Time complexity O(log n)
public class BinarySearch {

	public static void main(String[] args) {

		DataInput arr = new DataInput(1000000);
		int search = 999999;
		Boolean isFound = false;
		int low = 0;
		int high = arr.getSize() - 1;
		int mid = 0;
		while (!isFound) {
			if (low > high) {
				System.out.println("Element not Found ");
				break;
			}
			mid = low + ((high - low) / 2);
			arr.numberTry++;
			if (arr.data[mid] == search) {
				System.out.println("Element found after " + arr.numberTry + " try");
				break;
			}
			if (arr.data[mid] < search) {
				low = mid + 1;
			}
			if (arr.data[mid] > search) {
				high = mid - 1;
			}
		}
	}
}
