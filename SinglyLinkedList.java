package org.linkedlist;

public class SinglyLinkedList<T extends Comparable<T>>{

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

	public void addFirst(T data) {
		Node<T> n=new Node<T>(data);
		n.next=head;
		head=n;
	}

	public void addAtIndex(T data, int index) {
		Node<T> n=new Node<T>(data);
		if(index==0) {
			n.next=head;
			head=n;
		}else {
			Node<T> temp=head;
			while(temp!=null && index>1) {
				temp=temp.next;
				index--;
			}
			if(temp==null) {
				System.out.println("Index not in the range");
			}
			n.next=temp.next;
			temp.next=n;
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

	public T deleteFirst() {
		if(head==null) {
			System.out.println("List is empty...");
			return null;
		}
		T data =head.data;
		head=head.next;
		return data;
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

	public T deleteAtIndex(int index) {

		if(head==null) {
			System.out.println("List is empty..");
			return null;
		}
		if(index==0) {
			T data=head.data;
			head=null;
			return data;
		}
		Node<T> temp=head;
		Node<T> prev=null;
		while(temp!=null && index>0) {
			prev=temp;
			temp=temp.next;
			index--;
		}
		if(temp==null) {
			System.out.println("Index not in the range..");
			return null;
		}else {
			prev.next=temp.next;
		}
		return temp.data;
	}

	public int size() {
		int count =0;
		Node<T> temp=head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}

	public boolean isEmpty() {
		return size()==0;
	}

	public T getFirst() {
		if(head==null) {
			System.out.println("List is empty");
			return null;
		}
		return head.data;
	}

	public T getLast() {
		if(head==null) {
			System.out.println("List is empty");
			return null;
		}
		Node<T> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
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

	public T getMiddleData() {
		Node<T> slow=head;
		Node<T> fast=head;
		while(slow!=null && fast!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow.data;
	}

	public Node<T> getMiddleNode(Node<T> start, Node<T> end) {
		if (start == null) 
			return null;

		Node<T> slow = start;
		Node<T> fast = start.next;

		while (fast != end) {
			fast = fast.next;
			if (fast != end) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}

	//Binary search on Linked list
	public boolean binarySearch(T key) {
		Node<T> start = head;
		Node<T> end = null;

		while (start != end) {
			Node<T> mid = getMiddleNode(start, end);
			if (mid == null) 
				return false;

			int cmp = key.compareTo(mid.data); 

			if (cmp == 0) {
				return true; // found
			} else if (cmp > 0) {
				start = mid.next; // search right
			} else {
				end = mid; // search left
			}
		}
		return false;
	}
}