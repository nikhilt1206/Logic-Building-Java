package com.logicbuilding;

public class LinkedList101 {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		traverseLinkedList(head);
	}
	
	public static void traverseLinkedList(Node head) {
		Node current = head;
		
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current=current.next;
		}
	}

}
