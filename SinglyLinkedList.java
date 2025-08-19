package org.linkedlist;


public class SinglyLinkedList<T>{

	class Node{
		T data;
		Node next;

		public Node(T data) {
			this.data=data;
		}
	}
	Node head;

	public void add(T data) {

		if(head==null) {
			head=new Node(data);
		}else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=new Node(data);
		}

	}


	public void display() {

		Node temp=head;
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
		Node temp=head;
		Node prev=null;
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
		Node prev=null;
		Node curr=head;
		Node next=null;

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
		Node slow=head;
		Node fast=head;

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
		Node temp=head;
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
