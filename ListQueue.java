package org.linkedlist;

public class ListQueue<T extends Comparable<T>> {

	SinglyLinkedList<T> queue=new SinglyLinkedList<T>();

	public void enqeue(T data) {
		queue.add(data);
	}

	public T deqeue() {
		return queue.deleteFirst();
	}

	public void display() {
		queue.display();
	}

	public int size() {
		return queue.size();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public T front() {
		return queue.getFirst();
	}

	public T rear() {
		return queue.getLast();
	}
}
