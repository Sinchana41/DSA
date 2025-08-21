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
		singlyLinkedList.addFirst(5);
		singlyLinkedList.display();//5->40->30->20->10
		singlyLinkedList.deleteFirst();
		singlyLinkedList.display();//40->30->20->10
		System.out.println(singlyLinkedList.getMiddleData());//20
		System.out.println(singlyLinkedList.isEmpty());//false
		System.out.println(singlyLinkedList.getFirst());//40

		System.out.println(singlyLinkedList.hasLoop());//false

		SinglyLinkedList<Integer> singlyLinkedList1=new SinglyLinkedList<Integer>();
		Node<Integer> node1=new Node<Integer>(10);
		Node<Integer> node2=new Node<Integer>(20);
		Node<Integer> node3=new Node<Integer>(30);
		Node<Integer> node4=new Node<Integer>(40);
		Node<Integer> node5=new Node<Integer>(50);

		singlyLinkedList1.head=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node3;
		System.out.println(singlyLinkedList1.hasLoop());//true

		System.out.println("Element is found at position: "+singlyLinkedList.search(20));//Element is found at position: 3
	}
}
