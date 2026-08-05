package com.logicbuilding;

public class ReverseLinkedList2 {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		
		traverseLinkedList(head);
		System.out.println();
		traverseLinkedList(reverseLinkedList(head));
	}

	public static void traverseLinkedList(Node head) {
		Node current = head;
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current = current.next;
		}
	}
	
	public static Node reverseLinkedList(Node head) {
		Node current = head;
		Node prev = null;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
