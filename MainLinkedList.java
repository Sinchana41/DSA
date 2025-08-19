package org.linkedlist;

public class MainLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList<Integer> singlyLinkedList=new SinglyLinkedList<Integer>();
		singlyLinkedList.add(10);
		singlyLinkedList.add(20);
		singlyLinkedList.add(30);
		singlyLinkedList.add(40);
		singlyLinkedList.display();//10->20->30->40
		singlyLinkedList.reverse();
		singlyLinkedList.display();//40->30->20->10

		System.out.println(singlyLinkedList.hasLoop());//false


		SinglyLinkedList<Integer> singlyLinkedList1=new SinglyLinkedList<Integer>();
		Node<Integer> a=new Node<Integer>(10);
		Node<Integer> b=new Node<Integer>(20);
		Node<Integer> c=new Node<Integer>(30);
		Node<Integer> d=new Node<Integer>(40);
		Node<Integer> e=new Node<Integer>(50);

		singlyLinkedList1.head=a;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=c;
		System.out.println(singlyLinkedList1.hasLoop());//true

		System.out.println("Element is found at position: "+singlyLinkedList.search(20));//Element is found at position: 3
	}
}
