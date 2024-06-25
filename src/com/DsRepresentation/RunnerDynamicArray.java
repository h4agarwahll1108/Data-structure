package com.DsRepresentation;

public class RunnerDynamicArray {

	public static void main(String[] args) {
		DynamicArray<Integer> da = new DynamicArray<Integer>();
		System.out.println("Size : " + da.getSize());
		da.put(11); //size 1
		System.out.println("Size : " + da.getSize());
		da.put(12); //size 2
		System.out.println("Size : " + da.getSize());
		da.put(13); //size 4
		System.out.println("Size : " + da.getSize());
		da.put(14); //size 4
		System.out.println("Size : " + da.getSize());
		da.put(15); //size 8
		System.out.println("Size : " + da.getSize());
		for (int i = 0; i < da.getSize(); i++) {
			System.out.print(da.getValue(i)+ "\t");
		}

	}

} 
