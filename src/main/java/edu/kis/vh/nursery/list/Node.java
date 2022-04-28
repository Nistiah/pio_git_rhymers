package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node prev;
	protected Node next;

	public Node(int i) {
		this.value=i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
