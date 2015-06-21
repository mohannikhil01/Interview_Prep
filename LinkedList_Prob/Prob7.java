package LLEx;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Prob7 {

	public static void main(String args[]){
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
		Node d9 = new Node(11);
		head.setNext(d);
		d.setNext(d1);
		d1.setNext(d2);
		d2.setNext(d3);
		d3.setNext(d4);
		d4.setNext(d5);
		d5.setNext(d6);
		d6.setNext(d7);
		d7.setNext(d8);
		d8.setNext(d9);
		LinkedList x = new LinkedList();
		x.printLinkedList(head);
		findmiddleLinkedList(head);
	}
	
	public static int findmiddleLinkedList(Node head){
		Node slow = head;
		Node fast = head;
		while(fast.getNext()!=null){
			slow = slow.getNext();
			fast = fast.getNext();
			fast = fast.getNext();
		}
		System.out.println(slow.getData());
		
		return slow.getData();
	}
}
