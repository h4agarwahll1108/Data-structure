package com.DsRepresentation;

public class NodeSingle {
	Object value;
	NodeSingle next;

	public NodeSingle(Object value, NodeSingle next) {
		this.value = value;
		this.next = next;
	}
	
	public NodeSingle(Object value) {
		this.value = value;
		this.next = null;
	}

}
