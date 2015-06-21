package LLEx;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Prob3 {

	public static void main(String as[]) {
		Node head = new Node(1);
		Node d = new Node(2);
		Node d1 = new Node(3);
		Node d2 = new Node(4);
		Node d3 = new Node(5);
		Node d4 = new Node(6);
		Node d5 = new Node(7);
		Node d6 = new Node(8);
		Node d7 = new Node(9);
		Node d8 = new Node(10);
		head.setNext(d);
		d.setNext(d1);
		d1.setNext(d2);
		d2.setNext(d3);
		d3.setNext(d4);
		d4.setNext(d5);
		d5.setNext(d6);
		d6.setNext(d7);
		d7.setNext(d8);
		Node newNode = new Node(11);
		Node n1 = new Node(0);
		head = insertInSortedLinkedList(head, newNode);
		LinkedList l = new LinkedList();
		l.printLinkedList(head);
		head = insertInSortedLinkedList(head, n1);
		l.printLinkedList(head);
	}

	public static Node insertInSortedLinkedList(Node head, Node newNode) {
		Node prev = head, curr = head;
		if (head == null) {
			return newNode;
		}
		if (newNode.getData() <= head.getData()) {
			newNode.setNext(head);
			return newNode;
		} else {
			while (curr!=null && curr.getData() <= newNode.getData()) {
				prev = curr;
				curr = curr.getNext();
			}
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
			return head;
		}
	}

}
