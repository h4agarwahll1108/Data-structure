package com.SearchingAlgorithms;

//Better for Phone or Dictonary in which starting number are same
//eg differnt country have starting 91 digit different
//Time complexity O(n)
public class InterpolationSearch {

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
			mid = low + (((high - low) / (arr.data[high] - arr.data[low])) * (search - arr.data[low]));
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
