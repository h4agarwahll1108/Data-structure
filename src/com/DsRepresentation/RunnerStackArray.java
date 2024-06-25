package com.DsRepresentation;

public class RunnerStackArray {

	public static void main(String[] args) {
		StackArray<String> sa = new StackArray<>(4);
		sa.push("Harshit");
		sa.push("pragati");
		sa.push("sagar");
		sa.push("aman");
		sa.push("sunny");
		while (!sa.isStackEmpty()) {
			System.out.println(sa.pop());
		}
		sa.pop();

	}

}
