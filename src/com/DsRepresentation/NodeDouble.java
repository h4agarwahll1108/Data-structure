package com.DsRepresentation;

public class NodeDouble {
	Object value;
	NodeDouble next;
	NodeDouble previous;

	public NodeDouble(Object value, NodeDouble next, NodeDouble previous) {
		this.value = value;
		this.next = next;
		this.previous = previous;
	}

}
