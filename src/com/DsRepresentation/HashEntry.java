package com.DsRepresentation;

public class HashEntry {

	int key;
	Object Value;
	HashEntry next;

	public HashEntry(int key, Object value) {
		this.key = key;
		this.Value = value;
		next = null;
	}

	public HashEntry() {
		next = null;
	}

	public int getKey() {
		return key;
	}

	public Object getValue() {
		return Value;
	}

}
