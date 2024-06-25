package com.DsRepresentation;

public class RunnerHashMap {

	public static void main(String[] args) {
		HashMapTable<String> hs = new HashMapTable<String>(3);
		hs.put(11, "Harshit");
		hs.put(12, "Seema");
		hs.put(13, "Aman");
		System.out.println(hs.get(13));
		System.out.println(hs.get(12));
		System.out.println(hs.get(11));

	}

}
