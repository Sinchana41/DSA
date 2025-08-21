package org.linkedlist;

public class MainListQueue {

	public static void main(String[] args) {
		ListQueue<Integer> listQueue=new ListQueue<Integer>();
		listQueue.enqeue(10);
		listQueue.enqeue(20);
		listQueue.enqeue(30);
		listQueue.enqeue(40);
		listQueue.display();//10->20->30->40
		System.out.println(listQueue.front());//10
		System.out.println(listQueue.rear());//40
		listQueue.deqeue();
		listQueue.display();//20->30->40
		listQueue.deqeue();
		listQueue.display();//30->40
		listQueue.enqeue(10);
		listQueue.display();//30->40->10
		System.out.println(listQueue.front());//30
		System.out.println(listQueue.rear());//10

		System.out.println(listQueue.size());//3
		System.out.println(listQueue.isEmpty());//false
	}
}
