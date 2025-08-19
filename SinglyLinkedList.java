package org.linkedlist;


public class SinglyLinkedList<T>{


	Node<T> head;

	public void add(T data) {

		if(head==null) {
			head=new Node<T>(data);
		}else {
			Node<T> temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node<T>(data);
		}

	}


	public void display() {

		Node<T> temp=head;
		while(temp!=null) {

			System.out.print(temp.data);

			if(temp.next!=null)
				System.out.print("->");

			temp=temp.next;

		}
		System.out.println();
	}

	public T delete() {
		if(head==null) {
			System.out.println("List is empty...");
			return null;
		}
		Node<T> temp=head;
		Node<T> prev=null;
		while(temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==head) {//or(prev==null)
			head=null;
		}else {
			prev.next=null;
		}

		return temp.data;
	}

	//1. Reverse a Linked List
	public void reverse() {
		Node<T> prev=null;
		Node<T> curr=head;
		Node<T> next=null;

		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}

	//2.Detect a Cycle in a Linked List
	public boolean hasLoop() {
		Node<T> slow=head;
		Node<T> fast=head;

		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}

	//5.Search in a Linked List
	public int search(T key) {
		int count=0;
		Node<T> temp=head;
		while(temp!=null) {
			count++;
			if(temp.data==key) {
				return count;
			}
			temp=temp.next;
		}
		return-1;
	}
}
