package org.linkedlist;

public class ListStack<T extends Comparable<T>> {

	SinglyLinkedList<T> stack=new SinglyLinkedList<T>();

	public void push(T data) {
		stack.addFirst(data);
	}

	public T peek() {
		if(stack.isEmpty()) {
			System.out.println("Stack is under flow....");
			return null;
		}
		return stack.getFirst();
	}

	public T pop() {
		if(stack.isEmpty()) {
			System.out.println("Stack is under flow....");
			return null;
		}

		return stack.delete();
	}

	public void display() {
		stack.display();
	}

	public int size() {
		return stack.size();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

}
