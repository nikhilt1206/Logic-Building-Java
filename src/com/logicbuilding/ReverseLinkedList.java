package com.logicbuilding;

public class ReverseLinkedList {

	public static void main(String[] args) {

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		
		Node reverseHead = reverseLinkedList(head);
		traverseLinkedList(reverseHead);
		//traverseLinkedList(head);
		//System.out.println("");
		//traverseLinkedList(reverseLinkedList(head));
	}

	private static void traverseLinkedList(Node head) {
		
		Node current = head;
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current = current.next;
		}
		
	}
	private static Node reverseLinkedList(Node head) {
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
