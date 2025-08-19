package org.linkedlist;

import org.linkedlist.SinglyLinkedList.Node;

public class MainLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> sl=new SinglyLinkedList<Integer>();
		sl.add(10);
		sl.add(20);
		sl.add(30);
		sl.add(40);
		sl.display();//10->20->30->40
		sl.reverse();
		sl.display();//40->30->20->10

		System.out.println(sl.hasLoop());//false

		SinglyLinkedList<Integer> s=new SinglyLinkedList<Integer>();
		Node a=s.new Node(10);
		Node b=s.new Node(20);
		Node c=s.new Node(30);
		Node d=s.new Node(40);
		Node e=s.new Node(50);

		s.head=a;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=c;

		System.out.println(s.hasLoop());//true

		System.out.println("Element is found at position: "+sl.search(20));//Element is found at position: 3
	}
}
