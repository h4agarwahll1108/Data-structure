package com.DsRepresentation;

import java.util.Arrays;

public class DynamicArray<T> {
	Object[] data;
	int size;

	public DynamicArray() {
		size = 0;
		data = new Object[1]; // initial a= [];

	}

	public int getSize() {
		return data.length;
	}

	@SuppressWarnings("unchecked")
	public T getValue(int index) {
		return (T) data[index];
	}

	public void put(Object element) {
		ensureCapacity(size + 1); 
		data[size++] = element;
	}

	private void ensureCapacity(int mincapacity) { 
		int oldcapacity = getSize(); 
		if (mincapacity > oldcapacity) { 
			int newcapacity = oldcapacity * 2; 
			if (newcapacity < mincapacity) { 
				newcapacity = mincapacity;
			}
			data = Arrays.copyOf(data, newcapacity);
		}

	}

}
