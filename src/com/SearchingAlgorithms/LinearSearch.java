package com.SearchingAlgorithms;

//Time Complexity O(n)
public class LinearSearch {

	public static void main(String[] args) {

		DataInput arr = new DataInput(1000000);
		int search = 999999;
		Boolean isFound = false;

		for (int i = 0; i < arr.getSize(); i++) {
			arr.numberTry++;
			if (arr.data[i] == search) {
				System.out.println("Element fount after " + arr.numberTry + " try");
				isFound = true;
				break;
			}
		}
		if (isFound == false) {
			System.out.println("Element not Found ");
		}
	}
}
