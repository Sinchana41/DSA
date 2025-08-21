package org.linkedlist;

public class MainListStack {

	public static void main(String[] args) {
		ListStack<Integer> listStack=new ListStack<Integer>();
		listStack.push(10);
		listStack.push(20);
		listStack.push(30);
		listStack.push(40);
		listStack.display();//40->30->20->10
		System.out.println(listStack.peek());//40
		System.out.println(listStack.peek());//40
		listStack.display();//40->30->20->10
		listStack.pop();
		listStack.display();//40->30->20
		System.out.println(	listStack.isEmpty());//false
		System.out.println(	listStack.size());//3
	}
}
