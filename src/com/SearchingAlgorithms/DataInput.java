package com.SearchingAlgorithms;

public class DataInput {
	int[] data;
	int numberTry;

	public DataInput(int size) {

		data = new int[size];
		for (int i = 1; i <= size; i++) {
			data[i - 1] = i;
		}
		numberTry = 0;
	}

	public int getSize() {
		return data.length;
	}

}
