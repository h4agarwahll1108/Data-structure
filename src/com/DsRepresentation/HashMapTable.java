package com.DsRepresentation;

public class HashMapTable<T> {

	HashEntry[] hashArray;
	int size;

	public HashMapTable(int size) {
		this.size = size;
		hashArray = new HashEntry[this.size];
		for (int i = 0; i < size; i++) {
			hashArray[i] = new HashEntry();
		}
	}

	public int getHashIndex(int key) {
		return key % size;
	}

	public void put(int key, Object value) {
		int hashIndex = getHashIndex(key);
		HashEntry oldArrayValue = hashArray[hashIndex];
		HashEntry newItem = new HashEntry(key, value);
		newItem.next = oldArrayValue.next;
		oldArrayValue.next = newItem;
	}

	@SuppressWarnings("unchecked")
	public T get(int key) {
		T value = null;
		int hashIndex = getHashIndex(key);
		HashEntry oldArrayValue = hashArray[hashIndex];
		while (oldArrayValue != null) {
			if (oldArrayValue.getKey() == key) {
				value = (T) oldArrayValue.getValue();
				break;
			}
			oldArrayValue = oldArrayValue.next;
		}
		return value;
	}
}
