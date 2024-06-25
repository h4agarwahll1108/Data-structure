package com.DsRepresentation;

public class RunnerStackDynamicArray {

	public static void main(String[] args) {
		StackDyinamicArray<Integer> sd = new StackDyinamicArray<>();
		System.out.println("Size: " + sd.getSize());
		sd.push(12);
		System.out.println("Size: " + sd.getSize());
		sd.push(15);
		System.out.println("Size: " + sd.getSize());
		sd.push(16);
		System.out.println("Size: " + sd.getSize());
		sd.push(18);
		System.out.println("Size: " + sd.getSize());
		sd.push(17);
		System.out.println("Size: " + sd.getSize());

		System.out.println();
		while (!sd.isStackEmpty()) {
			System.out.println(sd.pop());
		}
	}

}
